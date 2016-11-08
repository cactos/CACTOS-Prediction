package eu.cactosfp7.cactosim.modelextractor.ui.wizards;

import java.util.function.Function;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import eu.cactosfp7.cactosim.modelextractor.queries.VMDescription;

public class VMTableViewerComparator extends ViewerComparator {

	private Function<VMDescription, Comparable<?>> columnValueGetter = Object::toString;
	private boolean reverseSort = false;
	
	public VMTableViewerComparator() {
		super();
	}
	
	public void setColumnValueGetter(Function<VMDescription, Comparable<?>> columnValueGetter) {
		if (this.columnValueGetter == columnValueGetter) {
			this.reverseSort = !this.reverseSort;  
		} else {
			this.reverseSort = false;
			this.columnValueGetter = columnValueGetter;
		}
	}
	
	public boolean isReverseSort() {
		return this.reverseSort;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		int result = 0;
		if (!(e1 instanceof VMDescription && e2 instanceof VMDescription)) {
			result = e1.toString().compareTo(e2.toString());
		} else {
			Object v1 = this.columnValueGetter.apply((VMDescription) e1);
			Object v2 = this.columnValueGetter.apply((VMDescription) e2);
			
			if (v1 instanceof Comparable && v2 instanceof Comparable) {
				result = ((Comparable) v1).compareTo(v2);
			} else {
				result = v1.toString().compareTo(v2.toString());
			}
		}
		return this.reverseSort ? -result : result;
	}
}


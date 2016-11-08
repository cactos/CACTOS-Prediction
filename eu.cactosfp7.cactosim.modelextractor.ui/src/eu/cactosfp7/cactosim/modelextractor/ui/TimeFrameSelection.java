package eu.cactosfp7.cactosim.modelextractor.ui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;

public class TimeFrameSelection extends AbstractObservableValue  {

    private Date date = Calendar.getInstance().getTime();

    private transient PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    
    public TimeFrameSelection() {
    }

    @Override
    public Object getValueType() {
        return Date.class;
    }
    
    @Override
    public void doSetValue(Object object) {
        Date selectedDate = (Date) object;
        Date oldDate = (Date) this.getValue();
        this.date = selectedDate;
        firePropertyChange("date", oldDate, date);
    }

    @Override
    protected Object doGetValue() {
        return this.date;
    }
    
    
    public void addPropertyChangeListener(String propertyName,
            PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(propertyName,
                listener);
    }
 
 
    public void removePropertyChangeListener(String propertyName,
            PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(propertyName,
                listener);
    }
 
    protected void firePropertyChange(String propertyName, Object oldValue,
            Object newValue) {
        propertyChangeSupport.firePropertyChange(propertyName, oldValue,
                newValue);
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.doSetValue(date);
    }
}

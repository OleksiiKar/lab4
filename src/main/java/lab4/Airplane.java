package lab4;
import java.util.Objects;
public class Airplane {
    /** The model name of the airplane. */
    private String model;
    /** The manufacturer of the airplane. */
    private String manufacturer;
    /** The top speed of the airplane in kilometers per hour (km/h). */
    private Integer topSpeed;
    /** The maximum altitude the airplane can reach in meters. */
    private Integer maxAltitude;
    /** The maximum payload capacity of the airplane in tonnes. */
    private Double payload;

    /**
     * Class constructor for getting sample data
     * @param model        receive and set the model name of the airplane
     * @param manufacturer receive and set the manufacturer of the airplane
     * @param topSpeed     receive and set the top speed of the airplane in km/h
     * @param maxAltitude  receive and set the maximum altitude of the airplane in meters
     * @param payload      receive and set the payload capacity of the airplane in tonnes
     */
    public Airplane(String model,
                    String manufacturer,
                    Integer topSpeed,
                    Integer maxAltitude,
                    Double payload){
        this.model = model;
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
        this.maxAltitude = maxAltitude;
        this.payload = payload;
    }
    /**
    * Standard toString method override
    * @return a formatted string containing all the airplane's details
    */
    @Override
    public String toString(){
        return "Model:"+this.model+"\n"+
                "Manufacturer:"+this.manufacturer+"\n"+
                "Top Speed:"+this.topSpeed+" km/h\n"+
                "Max Altitude:"+this.maxAltitude+" metres\n"+
                "Payload:"+this.payload+" tonnes\n";
    }
    /**
    *Override standard equals method
    * @param obj needed Object type variable for comparison objects
    * @return true if object equals to another
    */
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (!(obj instanceof Airplane compObj)) return false;

        return Objects.equals(this.model, compObj.model)
                && Objects.equals(this.manufacturer, compObj.manufacturer)
                && Objects.equals(this.topSpeed, compObj.topSpeed)
                && Objects.equals(this.maxAltitude, compObj.maxAltitude)
                && Objects.equals(this.payload, compObj.payload);
    }
    /**
     * Returns a hash code value for the airplane.
     * This method is supported for the benefit of hash tables.
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, topSpeed, maxAltitude, payload);
    }
    /**
     * Getter for model name of the airplane
     * @return name of sample
     */
    public String getModel(){
        return this.model;
    }
    /**
     * Getter for manufacturer of the airplane
     * @return manufacturer of sample
     */
    public String getManufacturer(){
        return this.manufacturer;
    }
    /**
     * Getter for top speed of the airplane in km/h
     * @return top speed of sample
     */
    public Integer getTopSpeed(){
        return this.topSpeed;
    }
    /**
     * Getter for maximum altitude of the airplane in meters
     * @return maximum altitude of sample
     */
    public Integer getMaxAltitude(){
        return this.maxAltitude;
    }
    /**
     * Getter for payload capacity of the airplane in tonnes
     * @return payload capacity of sample
     */
    public Double getPayload(){
        return this.payload;
    }
    /**
     * Sets the model of the airplane
     * @param model the new model to set
     */
    public void setModel(String model){
        this.model = model;
    }
    /**
     * Sets the manufacturer of the airplane
     * @param manufacturer the new manufacturer to set
     */
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    /**
     * Sets the top speed of the airplane in km/h
     * @param topSpeed the top speed to set
     */
    public void setTopSpeed(Integer topSpeed){
        this.topSpeed = topSpeed;
    }
    /**
     * Sets the maximum altitude of the airplane in meters
     * @param maxAltitude the new maximum altitude to set
     */
    public void setMaxAltitude(Integer maxAltitude){
        this.maxAltitude = maxAltitude;
    }
    /**
     * Sets the payload capacity of the airplane in tonnes
     * @param payload the new payload capacity to set
     */
    public void setPayload(Double payload){
        this.payload = payload;
    }
}

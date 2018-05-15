/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package welding;

/**
 *
 * @author Roman
 */
public class WeldingClass {
        private boolean units;
        private String indicator;
        private String indicatorName;
        private String indicatorValue;
        private String indicatorUnits;
        private String process;
        private String fillerMaterial;
        private int welderEfficiency;
        private String sizeOfFilletWeld;
        private String amountOfShieldingGasUsed;
        private String numberOfGasBottlesRequired;
        private String amountOfFillerMetalNeeded;
        private String numberOfPassesPerJoint;
        private String actualWeldingTime;
        private String laborCost;
        private String weldingElectrodeCost;
        private String gasCost;
        private String powerCost;
        private String initialCost;
        private String totalCostPerUnitOfWeld;
        private String fillerCostPerUnitOfWeld;
        private String gasCostPerUnitOfWeld;
        private String laborCostPerUnitOfWeld;
        private String totalLengthOfWeld;
        private String unitCost;
        public boolean getUnits(){
            return units;
        }
        public void setUnits(boolean newUnits){
            units=newUnits;
        }
        public String getIndicator(){
            return indicator;
        }
        public void setIndicator(String newIndicator){
            indicator=newIndicator;
        }
        public String getIndicatorName(){
            return indicatorName;
        }
        public void setIndicatorName(String newIndicatorName){
            indicatorName=newIndicatorName;
        }
        public String getIndicatorValue(){
            return indicatorValue;
        }
        public void setIndicatorValue(String newIndicatorValue){
            indicatorValue=newIndicatorValue;
        }
        public String getIndicatorUnits(){
            return indicatorUnits;
        }
        public void setIndicatorUnits(String newIndicatorUnits){
            indicatorUnits=newIndicatorUnits;
        }
        public String getProcess(){
            return process;
        }
        public void setProcess(String newProcess){
            process=newProcess;
        }
        public String getFillerMaterial(){
            return fillerMaterial;
        }
        public void setFillerMaterial(String newFillerMaterial){
            fillerMaterial=newFillerMaterial;
        }
        public int getWelderEfficiency(){
            return welderEfficiency;
        }
        public void setWelderEfficiency(int newWelderEfficiency){
            welderEfficiency=newWelderEfficiency;
        }
        public String getSizeOfFilletWeld(){
            return sizeOfFilletWeld;
        }
        public void setSizeOfFilletWeld(String newSizeOfFilletWeld){
            sizeOfFilletWeld=newSizeOfFilletWeld;
        }
        public String getAmountOfShieldingGasUsed(){
            return amountOfShieldingGasUsed;
        }
        public void setAmountOfShieldingGasUsed(String newAmountOfShieldingGasUsed){
            amountOfShieldingGasUsed=newAmountOfShieldingGasUsed;
        }
        public String getNumberOfGasBottlesRequired(){
            return numberOfGasBottlesRequired;
        }
        public void setNumberOfGasBottlesRequired(String newNumberOfGasBottlesRequired){
            numberOfGasBottlesRequired=newNumberOfGasBottlesRequired;
        }
        public String getAmountOfFillerMetalNeeded(){
            return amountOfFillerMetalNeeded;
        }
        public void setAmountOfFillerMetalNeeded(String newAmountOfFillerMetalNeeded){
            amountOfFillerMetalNeeded=newAmountOfFillerMetalNeeded;
        }
        public String getNumberOfPassesPerJoint(){
            return numberOfPassesPerJoint;
        }
        public void setNumberOfPassesPerJoint(String newNumberOfPassesPerJoint){
            numberOfPassesPerJoint=newNumberOfPassesPerJoint;
        }
        public String getActualWeldingTime(){
            return actualWeldingTime;
        }
        public void setActualWeldingTime(String newActualWeldingTime){
            actualWeldingTime=newActualWeldingTime;
        }
        public String getLaborCost(){
            return laborCost;
        }
        public void setLaborCost(String newLaborCost){
            laborCost=newLaborCost;
        }
        public String getWeldingElectrodeCost(){
            return weldingElectrodeCost;
        }
        public  void setWeldingElectrodeCost(String newWeldingElectrodeCost){
            weldingElectrodeCost=newWeldingElectrodeCost;
        }
        public String getGasCost(){
            return gasCost;
        }
        public void setGasCost(String newGasCost){
            gasCost=newGasCost;
        }
        public String getPowerCost(){
            return powerCost;
        }
        public void setPowerCost(String newPowerCost){
            powerCost=newPowerCost;
        }
        public String getInitialCost(){
            return initialCost;
        }
        public void setInitialCost(String newInitialCost){
            initialCost=newInitialCost;
        }
        public String getTotalCostPerUnitOfWeld(){
            return totalCostPerUnitOfWeld;
        }
        public void setTotalCostPerUnitOfWeld(String newTotalCostPerUnitOfWeld){
            totalCostPerUnitOfWeld=newTotalCostPerUnitOfWeld;
        }
        public String getFillerCostPerUnitOfWeld(){
            return fillerCostPerUnitOfWeld;
        }
        public void setFillerCostPerUnitOfWeld(String newFillerCostPerUnitOfWeld){
            fillerCostPerUnitOfWeld=newFillerCostPerUnitOfWeld;
        }
        public String getGasCostPerUnitOfWeld(){
            return gasCostPerUnitOfWeld;
        }
        public void setGasCostPerUnitOfWeld(String newGasCostPerUnitOfWeld){
            gasCostPerUnitOfWeld=newGasCostPerUnitOfWeld;
        }
        public String getLaborCostPerUnitOfWeld(){
            return laborCostPerUnitOfWeld;
        }
        public void setLaborCostPerUnitOfWeld(String newLaborCostPerUnitOfWeld){
            laborCostPerUnitOfWeld=newLaborCostPerUnitOfWeld;
        }
        public String getTotalLengthOfWeld(){
            return totalLengthOfWeld;
        }
        public void setTotalLengthOfWeld(String newTotalLengthOfWeld){
            totalLengthOfWeld=newTotalLengthOfWeld;
        }
        public String getUnitCost(){
            return unitCost;
        }
        public void setUnitCost(String newUnitCost){
            unitCost=newUnitCost;
        }
        public WeldingClass(){
            units=true;
            indicator="";
            indicatorName="";
            indicatorValue="";
            indicatorUnits="";
            process="SAW";
            fillerMaterial="Carbon Steel";
            welderEfficiency=10;
            sizeOfFilletWeld="";
            amountOfShieldingGasUsed="";
            numberOfGasBottlesRequired="";
            amountOfFillerMetalNeeded="";
            numberOfPassesPerJoint="";
            actualWeldingTime="";
            laborCost="";
            weldingElectrodeCost="";
            gasCost="";
            powerCost="";
            initialCost="";
            totalCostPerUnitOfWeld="";
            fillerCostPerUnitOfWeld="";
            gasCostPerUnitOfWeld="";
            laborCostPerUnitOfWeld="";
            totalLengthOfWeld="";
            unitCost="";
        }
}

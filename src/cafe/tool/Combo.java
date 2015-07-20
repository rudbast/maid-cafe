/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafe.tool;

/**
 *
 * @author JB Nizet
 * @Ref : http://stackoverflow.com/questions/5661556/jcombobox-setting-label-and-value
 */
public class Combo {
    private String label;
    private String value;
    
    public Combo(String value, String label) {
        this.value = value;
        this.label = label;
    }
    
    public String getValue() {
        return this.value;
    }

    public String getLabel() {
        return this.label;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
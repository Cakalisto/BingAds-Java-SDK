
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCompany">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Company" type="{https://bingads.microsoft.com/CampaignManagement/v13}Company" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompany", propOrder = {
    "companies"
})
public class ArrayOfCompany {

    @XmlElement(name = "Company", nillable = true)
    protected List<Company> companies;

    /**
     * Gets the value of the companies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the companies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Company }
     * 
     * 
     * @return
     *     The value of the companies property.
     */
    public List<Company> getCompanies() {
        if (companies == null) {
            companies = new ArrayList<>();
        }
        return this.companies;
    }

}

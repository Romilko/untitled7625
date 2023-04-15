package MyProject;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectName {
    private String shortName;
    private String name;
    private String organisation;
    private String organisationAddress;
    private String contractType;
    private String contractDate;

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public void setOrganisationAddress(String organisationAddress) {
        this.organisationAddress = organisationAddress;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getShortName() {
        return shortName;
    }

    public String getName() {
        return name;
    }

    public String getOrganisation() {
        return organisation;
    }

    public String getOrganisationAddress() {
        return organisationAddress;
    }

    public String getContractType() {
        return contractType;
    }

    public String getContractDate() {
        return contractDate;
    }
    public String toString(){
        return "Имя проекта: "+getName()+" Адрес: "+getOrganisationAddress()+" Контрагент: "+getOrganisation();
    }
}

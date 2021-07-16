package model;

import java.time.LocalDate;


public class CustomerDTO {

    private String name;
    private String phone;
    private String car_number;
    private String service_end;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarNumber() {
        return car_number;
    }

    public void setCarNumber(String car_number) {
        this.car_number = car_number;
    }

    public String getServiceEnd() {
        return service_end;
    }

	public void setServiceEnd(String serviceDate) {
		this.service_end = serviceDate;
	}
}
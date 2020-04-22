package uk.co.expedia.resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "LoginCredentials")
    //method returning two dimensional object
    public Object[][] getLoginData() {

        //creating object of the two dimensional Object[][]
        return new Object[][]{

                //adding data set to the two dimensional Object[][]
                {"xyz13@gmail.com","abc123"}
        };
    }

    @DataProvider(name = "FlightSearchDetails")

    public Object[][] getFlightSearchData() {

        return new Object[][]{

                {"LHR","BOM","22/08/2020","28/08/2020"},
//                {"DXB","BOM","28/09/2020","28/10/2020"},
//                {"DEL","BOM","18/06/2020","19/07/2020"}

        };
    }

}



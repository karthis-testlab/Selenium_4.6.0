package com.testng.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;

public class SampleTestNGData {
	
	
	@Test
	@Description("This test attempts to log into the website using a login and a password. Fails if any error happens.\n\nNote that this test does not test 2-Factor Authentication.")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("John Doe")
    @Link(name = "Website", url = "https://dev.example.com/")
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
	public void testDataProviderIndices() throws IOException {
		int arr[] = {17, 32}; 
		int[] new_array = Arrays.copyOfRange(arr, 1, 2); 
		for (int num : new_array) 
			System.out.print(num + " "); 
		Allure.addAttachment("Failed Screenshot", Files.newInputStream(Paths.get("./images/failed.png")));
	}
	
	@DataProvider(indices = {1})
	public Object[][] data() {
		return new Object[][] {
			{"username1", "password1"},
			{"username2", "password2"}
		};
	}

}
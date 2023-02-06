package com.demo.extent.report.practice;

public interface IReports {

	public void startResult();

	public void startTestCase();

	public void endResult();

	public void reportStep(String desc, String status, boolean bSnap);

	public void reportStep(String desc, String status);

}
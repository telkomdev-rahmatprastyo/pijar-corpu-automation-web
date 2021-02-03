import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData

import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'Login as User Employee Admin'
WebUI.callTestCase(findTestCase('Login/Positive Cases/TC004-Make Sure User Employee Admin Can Login'), [:], FailureHandling.STOP_ON_FAILURE)

'The user employee view a text element to verify the username "Admintest 2"'
WebUI.verifyElementText(findTestObject('Admin/Dashboard/b_username'), 'Admintest 2')

'The user employee view a text element to verify the nik "1000"'
WebUI.verifyElementText(findTestObject('Admin/Dashboard/b_nik'), '1000')

'User employee click "Provider" on the side menu'
WebUI.click(findTestObject('Admin/Side Menu/div_Provider'))

'User employee input text search provider "javascript"'
WebUI.setText(findTestObject('Admin/Provider/input_Name_searchText'), 'javascript')

'User employee click button "Search"'
WebUI.click(findTestObject('Admin/Provider/button_Search'))

'User employee click provider javascript to see detail provider'
WebUI.click(findTestObject('Admin/Provider/delete/div_provider-javascript'))

'User employee click icon delete'
WebUI.click(findTestObject('Admin/Provider/delete/button_javascriptcom_provider-icon-delete b_417acc'))

'User employee click button "Delete" to delete provider'
WebUI.click(findTestObject('Admin/Provider/delete/button_Delete'))

'View Pop Up Congratulation / Success Delete Data'
WebUI.delay(1)

'The user employee view a text element to verify succes delete provider  "Congratulation"'
WebUI.verifyElementText(findTestObject('Admin/Provider/add/succes/h2_Congratulation'), 'Congratulation!')

'The user employee view a text element to verify succes delete provider "Success"'
WebUI.verifyElementText(findTestObject('Admin/Provider/add/succes/div_Success'), 'Success')

'Click "Ok"'
WebUI.click(findTestObject('Admin/Provider/add/succes/a_Ok'))


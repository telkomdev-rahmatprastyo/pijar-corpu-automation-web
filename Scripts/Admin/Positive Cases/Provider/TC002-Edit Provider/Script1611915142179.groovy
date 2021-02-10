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

'The user employee view a text element to verify the username "Admintest 2"'
WebUI.verifyElementText(findTestObject('Admin/Dashboard/b_username'), 'Admintest 2')

'The user employee view a text element to verify the nik "1000"'
WebUI.verifyElementText(findTestObject('Admin/Dashboard/b_nik'), '1000')

'User employee click "Provider" on the side menu'
WebUI.click(findTestObject('Admin/Side Menu/div_Provider'))

'User employee input text search provider "java"'
WebUI.setText(findTestObject('Admin/Provider/input_Name_searchText'), 'java')

'User employee click button "Search"'
WebUI.click(findTestObject('Admin/Provider/button_Search'))

'User employee click provider java to see detail provider'
WebUI.click(findTestObject('Admin/Provider/edit/div_provider-java'))

'User employee click icon edit'
WebUI.click(findTestObject('Admin/Provider/edit/button_edit'))

'User employee input text name provider "javascript"'
WebUI.setText(findTestObject('Admin/Provider/add/input__nameProvider'), 'javascript')

'User employee input text email provider "javascript@js.com"'
WebUI.setText(findTestObject('Admin/Provider/add/input__emailProvider'), 'javascript@js.com')

'User employee input text website provider "javascript.com"'
WebUI.setText(findTestObject('Admin/Provider/add/input__websiteProvider'), 'javascript.com')

'User employee input text description provider'
WebUI.setText(findTestObject('Admin/Provider/add/textarea__descriptionProvider'), 'JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera.')

'User employee input text username provider "javascriptdev"'
WebUI.setText(findTestObject('Admin/Provider/add/input__usernameProvider'), 'javascriptdev')

'User employee input text password provider "javascriptdev"'
WebUI.setText(findTestObject('Admin/Provider/add/input__passwordProvider'), 'javascriptdev')

'User employee input confirm password "javascriptdev"'
WebUI.setText(findTestObject('Admin/Provider/add/input__confirmPasswordProvider'), 'javascriptdev')

WebUI.delay(5)

'User employee click button "Submit" to save the successfully edited provider'
WebUI.click(findTestObject('Admin/Provider/add/button_Submit'))

'View Pop Up Congratulation / Success Edit Data'
WebUI.delay(1)

'The user employee view a text element to verify succes save edited provider  "Congratulation"'
WebUI.verifyElementText(findTestObject('Admin/Provider/add/succes/h2_Congratulation'), 'Congratulation!')

'The user employee view a text element to verify succes save edited provider "Success"'
WebUI.verifyElementText(findTestObject('Admin/Provider/add/succes/div_Success'), 'Success')

'Click "Ok"'
WebUI.click(findTestObject('Admin/Provider/add/succes/a_Ok'))


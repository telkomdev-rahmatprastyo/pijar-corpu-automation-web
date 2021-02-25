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
import org.openqa.selenium.Keys as Keys

'The user employee view a text element to verify the username "Admintest 2"'
WebUI.verifyElementText(findTestObject('Admin/Dashboard/b_username'), 'Admintest 2')

'The user employee view a text element to verify the nik "1000"'
WebUI.verifyElementText(findTestObject('Admin/Dashboard/b_nik'), '1000')

'User employee click "Provider" on the side menu'
WebUI.click(findTestObject('Admin/Side Menu/div_Provider'))

'User employee click button "Add New Provider"'
WebUI.click(findTestObject('Admin/Provider/add/button_Add New Provider'))

'User employee input text name provider "java"'
WebUI.setText(findTestObject('Admin/Provider/add/input__nameProvider'), 'java')

'User employee input text email provider "java@java.com"'
WebUI.setText(findTestObject('Admin/Provider/add/input__emailProvider'), 'java@java.com')

'User employee input text website provider "java.com"'
WebUI.setText(findTestObject('Admin/Provider/add/input__websiteProvider'), 'java.com')

'User employee input text description provider'
WebUI.setText(findTestObject('Admin/Provider/add/textarea__descriptionProvider'), 'Penulisan dalam bahasa pemrograman Java adalah cara utama untuk menghasilkan kode yang akan digunakan sebagai kode byte pada sebuah Mesin Virtual Java (JVM)')

'User employee input text username provider "javadev"'
WebUI.setText(findTestObject('Admin/Provider/add/input__usernameProvider'), 'javadev')

'User employee input text password provider "javadev"'
WebUI.setText(findTestObject('Admin/Provider/add/input__passwordProvider'), 'javadev')

'User employee input confirm password "javadev"'
WebUI.setText(findTestObject('Admin/Provider/add/input__confirmPasswordProvider'), 'javadev')

'User employee click "image" to upload image'
WebUI.click(findTestObject('Admin/Provider/add/img__provider-edit-img'))

WebUI.delay(5)

'User employee click button "Submit" to save the successfully added provider'
WebUI.click(findTestObject('Admin/Provider/add/button_Submit'))

'View Pop Up Congratulation / Success Save Data'
WebUI.delay(1)

'The user employee view a text element to verify succes save added provider  "Congratulation"'
WebUI.verifyElementText(findTestObject('Admin/Provider/add/succes/h2_Congratulation'), 'Congratulation!')

'The user employee view a text element to verify succes save added provider "Success"'
WebUI.verifyElementText(findTestObject('Admin/Provider/add/succes/div_Success'), 'Success')

'Click "Ok"'
WebUI.click(findTestObject('Admin/Provider/add/succes/a_Ok'))


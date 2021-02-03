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

'Users view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'Users view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

'User click "Course" to user employee learner view a list of courses'
WebUI.click(findTestObject('Learner/Side Menu/Courses'))

'User click button "Next"'
WebUI.click(findTestObject('Learner/Courses/Pagination without param/button_NextNext'))

'User click page number 4'
WebUI.click(findTestObject('Learner/Courses/Pagination/button_4'))

'User click button "Previous"'
WebUI.click(findTestObject('Learner/Courses/Pagination without param/button_PreviousPrevious'))

'User click button "Last"'
WebUI.click(findTestObject('Learner/Courses/Pagination without param/button_Last'))

'User click button "First"'
WebUI.click(findTestObject('Learner/Courses/Pagination without param/button_First'))

WebUI.delay(2)

WebUI.refresh()


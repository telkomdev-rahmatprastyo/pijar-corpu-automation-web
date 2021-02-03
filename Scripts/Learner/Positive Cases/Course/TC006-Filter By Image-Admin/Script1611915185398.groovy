import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.refresh()

CustomKeywords.'learnaja.login.loginLearnAja'(GlobalVariable.BASEURL, GlobalVariable.nikEmployeeAdmin, GlobalVariable.passwordEmployeeAdmin)

'The user employee view a text element to verify the username "Admintest 2"'
WebUI.verifyElementText(findTestObject('Admin/Dashboard/b_username'), 'Admintest 2')

'The user employee view a text element to verify the nik "1000"'
WebUI.verifyElementText(findTestObject('Admin/Dashboard/b_nik'), '1000')

'User click "Course" to user employee learner view a list of courses'
WebUI.click(findTestObject('Learner/Side Menu/Courses'))

'User click "Course Categories" to filter the course list by course category'
WebUI.click(findTestObject('Learner/Courses/filter/Category/div_Course Category'))

'User click "Web Development" to see a list of courses with the selected course category web development'
WebUI.click(findTestObject('Learner/Courses/filter/Category/div_Web Development'))

'User click "Level" to filter the course list by level'
WebUI.click(findTestObject('Learner/Courses/filter/Level/div_Level'))

'User click "Not Categorized"'
WebUI.click(findTestObject('null'))

'User click "Rating" to filter the course list by rating'
WebUI.click(findTestObject('Learner/Courses/filter/Rating/div_Rating'))

'User click rating >=  \'0\''
WebUI.click(findTestObject('Learner/Courses/filter/Rating/div_ 0'))

WebUI.click(findTestObject('Learner/Courses/filter/Image Availability/div_Image Availability'))

WebUI.click(findTestObject('Learner/Courses/filter/Image Availability/div_Available'))

WebUI.click(findTestObject('Learner/Courses/filter/Image Availability/div_Unavailable'))

'User click button "Reset"'
WebUI.click(findTestObject('Learner/Courses/Search/button_Reset'))


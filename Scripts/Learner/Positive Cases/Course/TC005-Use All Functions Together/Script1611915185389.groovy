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

'User click "Course Categories" to filter the course list by course category'
WebUI.click(findTestObject('Learner/Courses/filter/Category/div_Course Category'))

'User click "Web Development" to see a list of courses with the selected course category web development'
WebUI.click(findTestObject('Learner/Courses/filter/Category/div_Web Development'))

'User click "Level" to filter the course list by level'
WebUI.click(findTestObject('Learner/Courses/filter/Level/div_Level'))

'User click "Beginner"'
WebUI.click(findTestObject('Learner/Courses/filter/Level/div_BEGINNER'))

'User click "Beginner" to change level'
WebUI.click(findTestObject('Learner/Courses/filter/Level/div_BEGINNER'))

'User click level "Not Categorized" '
WebUI.click(findTestObject('Learner/Courses/filter/Level/div_Not Categorized'))

'User click "Rating" to filter the course list by rating'
WebUI.click(findTestObject('Learner/Courses/filter/Rating/div_Rating'))

'User click rating >=  \'0\''
WebUI.click(findTestObject('Learner/Courses/filter/Rating/div_ 0'))

'User click "Order by" '
WebUI.click(findTestObject('Learner/Courses/sort by/Page_Learn Aja/div_Order by'))

'User click "Lowest Price" to see list course sort by lowest price'
WebUI.click(findTestObject('Learner/Courses/sort by/Page_Learn Aja/div_Lowest Price'))

WebUI.delay(2)

'User input text search : \'css\''
WebUI.setText(findTestObject('Learner/Courses/Search/input_Order by_title-skill-input'), 'css')

'User click button "Search"'
WebUI.click(findTestObject('Learner/Courses/Search/button_Search'))

WebUI.delay(2)

'User click button "Next"'
WebUI.click(findTestObject('Learner/Courses/Pagination/button_NextNext'))

'User click button "Previous"'
WebUI.click(findTestObject('Learner/Courses/Pagination/button_PreviousPrevious'))

'User click button "Last"'
WebUI.click(findTestObject('Learner/Courses/Pagination/button_Last'))

'User click button "First"'
WebUI.click(findTestObject('Learner/Courses/Pagination/button_First'))

'User click button "Reset"'
WebUI.click(findTestObject('Learner/Courses/Search/button_Reset'))

WebUI.delay(2)

'User Employee Click "Logout"'
WebUI.click(findTestObject('Login/button_logout'))

WebUI.refresh()

WebUI.closeBrowser()


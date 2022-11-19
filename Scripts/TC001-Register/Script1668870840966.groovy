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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://en-gb.facebook.com/reg/')

WebUI.setText(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/firstname'), 'Alex')

WebUI.setText(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/lastname'), 'Severo')

WebUI.setText(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/email'), 'severoalexei@gmail.com')

WebUI.setText(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/re-enter email'), 'severoalexei@gmail.com')

WebUI.setEncryptedText(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/password'), 'qF/jAD2I3PQ=')

WebUI.selectOptionByValue(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/DOB'), '25', false)

WebUI.selectOptionByValue(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/MonthOfBirthday'), '6', false)

WebUI.selectOptionByValue(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/YearOfBirthday'), '2005', 
    false)

WebUI.click(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/input_Male_sex'))

WebUI.click(findTestObject('Register Object/Page_Sign up for Facebook  Facebook/button_Sign Up'))

WebUI.closeBrowser()


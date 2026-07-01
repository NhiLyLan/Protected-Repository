import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys

WebUI.comment('Story: Login to CURA system')

WebUI.comment('Given that the user has the valid login information')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.click(findTestObject('Web Browser/btn_MakeAppointment'))

WebUI.waitForElementPresent(findTestObject('Web Browser/txt_Username - Copy'), -4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Web Browser/txt_Username - Copy'), Username)

WebUI.waitForElementHasAttribute(findTestObject('Web Browser/txt_Password'), 'tesst', 3)

WebUI.setEncryptedText(findTestObject('Web Browser/txt_Password'), Password)

WebUI.comment('When he logins to CURA system')

WebUI.click(findTestObject('Web Browser/btn_Login'))

WebUI.comment('Then he should be able to login successfully')

WebUI.verifyTextPresent('Make Appointment', false)

WebUI.closeBrowser()


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
import java.sql.Timestamp as Timestamp
import java.util.Date as Date

Date date = new Date()

String timestamp = date.getTime()

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Pages/Account/span_My Account'))

WebUI.click(findTestObject('Object Repository/Pages/Account/Register/a_Register'))

WebUI.setText(findTestObject('Object Repository/Pages/Account/Register/input_firstname'), 'Test' + timestamp)

WebUI.setText(findTestObject('Object Repository/Pages/Account/Register/input_lastname'), 'Prueba final')

WebUI.setText(findTestObject('Object Repository/Pages/Account/Register/input_email'), ('test+' + timestamp) + '@test.com')

WebUI.setText(findTestObject('Object Repository/Pages/Account/Register/input_telephone'), '111111111')

WebUI.setEncryptedText(findTestObject('Object Repository/Pages/Account/Register/input_password'), 'P9ET2sDE0SE=')

WebUI.setEncryptedText(findTestObject('Object Repository/Pages/Account/Register/input_confirm'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Pages/Account/Register/input_agree'))

WebUI.click(findTestObject('Object Repository/Pages/Account/Register/btn_Continue'))

WebUI.click(findTestObject('Object Repository/Pages/Account/Register/a_Continue'))


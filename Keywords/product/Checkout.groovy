package product

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Checkout {

	@Keyword ()
	def checkout() {

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/btn_items_dropdown'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/btn_Checkout'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/h4_Step 1 Checkout Options'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/label_I want to use an existing address'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/inputbutton-payment-address'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/input_shipping_address'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/inputbutton-shipping-address'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/label_Flat Shipping Rate - 5.00'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/inputbutton-shipping-method'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/div_Cash On Delivery'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/label_Cash On Delivery'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/input_agree'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/inputbutton-payment-method'))

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/inputbutton-confirm'))

		WebUI.verifyElementText(findTestObject('Object Repository/Pages/Checkout/h1_order_success'),
				'Your order has been placed!')

		WebUI.click(findTestObject('Object Repository/Pages/Checkout/a_Continue'))
	}
}

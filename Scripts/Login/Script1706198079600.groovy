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

WebUI.openBrowser('https://www.kompas.com/')

WebUI.click(findTestObject('Object Button/Page_Berita Terkini Hari Ini, Kabar Akurat Terpercaya - Kompas.com/close login google (button)'))

WebUI.click(findTestObject('Object Button/Icon profile (button)'))

WebUI.click(findTestObject('Object Button/Login text (button)'))

WebUI.click(findTestObject('Object Foam/Email (foam)'))

WebUI.click(findTestObject('Object Foam/Email (foam)'))

WebUI.setText(findTestObject('Object Foam/Email (foam)'), 'azkakhowarizmi@gmail.com')

WebUI.click(findTestObject('Object Foam/Password (foam)'))

WebUI.setText(findTestObject('Object Foam/Password (foam)'), 'sayjdgaiueifhesihowiehf')

WebUI.verifyElementPresent(findTestObject('Text/Page_Login - KG Media ID/Text salah password (text)'), 0)

WebUI.click(findTestObject('Object Button/Input login text (button)'))

WebUI.setText(findTestObject('Object Foam/Email (foam)'), 'azkakhowarizmi@gmail.com')

WebUI.click(findTestObject('Object Foam/Password (foam)'))

WebUI.setText(findTestObject('Object Foam/Password (foam)'), 'zahwa2599')

WebUI.click(findTestObject('Object Button/Input login text (button)'))

WebUI.click(findTestObject('Object Foam/Object Foam/Search (foam)'))

WebUI.setText(findTestObject('Object Foam/Object Foam/Search (foam)'), 'pilpres')

WebUI.sendKeys(findTestObject('Object Button/Object Button/Icon search (button)'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Text/Click news (text)'), 90)

WebUI.scrollToElement(findTestObject('Text/Click news (text)'), 0)

WebUI.click(findTestObject('Text/Click news (text)'))

WebUI.scrollToElement(findTestObject('Text/Scroll text/Text berita 2 (text)'), 0)


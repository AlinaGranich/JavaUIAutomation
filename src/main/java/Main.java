import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.quit();
    }
}

// {
//  "id": "05274287-f4f8-4cad-95a0-61000bfc2fed",
//  "version": "2.0",
//  "name": "GeekProject1test",
//  "url": "https://crm.geekbrains.space/user/login",
//  "tests": [{
//    "id": "2d507858-456f-4224-b11e-d9baa714c42b",
//    "name": "test1",
//    "commands": [{
//      "id": "ef528272-312f-4e22-aa00-68dee9b7743a",
//      "comment": "",
//      "command": "open",
//      "target": "https://crm.geekbrains.space/user/login",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "12a4622a-6d42-485a-a532-0bb2e867dd51",
//      "comment": "",
//      "command": "setWindowSize",
//      "target": "704x566",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "5ec58b70-6ea1-4935-90e1-61d6eb763365",
//      "comment": "",
//      "command": "type",
//      "target": "id=prependedInput",
//      "targets": [
//        ["id=prependedInput", "id"],
//        ["name=_username", "name"],
//        ["css=#prependedInput", "css:finder"],
//        ["xpath=//input[@id='prependedInput']", "xpath:attributes"],
//        ["xpath=//form[@id='login-form']/fieldset/div/input", "xpath:idRelative"],
//        ["xpath=//input", "xpath:position"]
//      ],
//      "value": "Applanatest1"
//    }, {
//      "id": "77b14313-7efc-43f4-b20b-71ee7aa8af58",
//      "comment": "",
//      "command": "click",
//      "target": "id=prependedInput2",
//      "targets": [
//        ["id=prependedInput2", "id"],
//        ["name=_password", "name"],
//        ["css=#prependedInput2", "css:finder"],
//        ["xpath=//input[@id='prependedInput2']", "xpath:attributes"],
//        ["xpath=//form[@id='login-form']/fieldset/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div[2]/input", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "66642919-202e-4df1-b553-91fbd6b280c7",
//      "comment": "",
//      "command": "type",
//      "target": "id=prependedInput2",
//      "targets": [
//        ["id=prependedInput2", "id"],
//        ["name=_password", "name"],
//        ["css=#prependedInput2", "css:finder"],
//        ["xpath=//input[@id='prependedInput2']", "xpath:attributes"],
//        ["xpath=//form[@id='login-form']/fieldset/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div[2]/input", "xpath:position"]
//      ],
//      "value": "Student2020!"
//    }, {
//      "id": "a07348f9-bae0-45c7-86d6-5748a976cd3d",
//      "comment": "",
//      "command": "click",
//      "target": "id=_submit",
//      "targets": [
//        ["id=_submit", "id"],
//        ["name=_submit", "name"],
//        ["css=#\\_submit", "css:finder"],
//        ["xpath=//button[@id='_submit']", "xpath:attributes"],
//        ["xpath=//form[@id='login-form']/fieldset/div[3]/button", "xpath:idRelative"],
//        ["xpath=//button", "xpath:position"],
//        ["xpath=//button[contains(.,'Войти')]", "xpath:innerText"]
//      ],
//      "value": ""
//    }, {
//      "id": "f66a365d-a1f4-4be0-abbf-fb2819d27d5d",
//      "comment": "",
//      "command": "mouseOver",
//      "target": "css=#main-menu > ul > li:nth-child(3) > a > span",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "8fa4ffc1-6a11-4c7a-9774-871d45dd64cc",
//      "comment": "",
//      "command": "click",
//      "target": "css=.dropdown:nth-child(3) .single:nth-child(4) .title",
//      "targets": [
//        ["css=.dropdown:nth-child(3) .single:nth-child(4) .title", "css:finder"],
//        ["xpath=//div[@id='main-menu']/ul/li[3]/ul/li[4]/a/span", "xpath:idRelative"],
//        ["xpath=//li[3]/ul/li[4]/a/span", "xpath:position"],
//        ["xpath=//span[contains(.,'Мои проекты')]", "xpath:innerText"]
//      ],
//      "value": ""
//    }, {
//      "id": "f0ff14f6-b39a-4f65-95ef-3b4bb8190510",
//      "comment": "",
//      "command": "click",
//      "target": "linkText=Создать проект",
//      "targets": [
//        ["linkText=Создать проект", "linkText"],
//        ["css=.back", "css:finder"],
//        ["xpath=(//a[contains(text(),'Создать проект')])[3]", "xpath:link"],
//        ["xpath=//div[@id='container']/div/div/div/div[2]/div/div/a", "xpath:idRelative"],
//        ["xpath=(//a[contains(@href, '/project/create/')])[3]", "xpath:href"],
//        ["xpath=//div[2]/div/div/a", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "aa8d548a-c5b7-4052-b6c6-d3bfbb5b8947",
//      "comment": "",
//      "command": "click",
//      "target": "xpath=//input[@name=\"crm_project[name]\"]",
//      "targets": [
//        ["id=crm_project_name-uid-619d58ee04fc8", "id"],
//        ["name=crm_project[name]", "name"],
//        ["css=#crm_project_name-uid-619d58ee04fc8", "css:finder"],
//        ["xpath=//input[@id='crm_project_name-uid-619d58ee04fc8']", "xpath:attributes"],
//        ["xpath=//form[@id='crm_project-uid-619d58ee6c405']/div[2]/div[3]/div/div/div[2]/fieldset/div/div/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div/div/div[2]/input", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "816e7c64-e4bc-4f0d-8166-d235c36517f0",
//      "comment": "",
//      "command": "type",
//      "target": "xpath=//input[@name=\"crm_project[name]\"]",
//      "targets": [
//        ["id=crm_project_name-uid-619d58ee04fc8", "id"],
//        ["name=crm_project[name]", "name"],
//        ["css=#crm_project_name-uid-619d58ee04fc8", "css:finder"],
//        ["xpath=//input[@id='crm_project_name-uid-619d58ee04fc8']", "xpath:attributes"],
//        ["xpath=//form[@id='crm_project-uid-619d58ee6c405']/div[2]/div[3]/div/div/div[2]/fieldset/div/div/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div/div/div[2]/input", "xpath:position"]
//      ],
//      "value": "Smth"
//    }, {
//      "id": "ad13a025-ba04-4367-97a6-1a9b07bc6b47",
//      "comment": "",
//      "command": "mouseDown",
//      "target": "css=.select2-default > .select2-chosen",
//      "targets": [
//        ["css=.select2-default > .select2-chosen", "css:finder"],
//        ["xpath=//div[@id='s2id_crm_project_company-uid-619d58ee05b25']/a/span", "xpath:idRelative"],
//        ["xpath=//div/a/span", "xpath:position"],
//        ["xpath=//span[contains(.,'Укажите организацию')]", "xpath:innerText"]
//      ],
//      "value": ""
//    }, {
//      "id": "9fd1cd01-dff1-4eb1-996e-3668b42574e4",
//      "comment": "",
//      "command": "mouseUp",
//      "target": "id=select2-drop-mask",
//      "targets": [
//        ["id=select2-drop-mask", "id"],
//        ["css=#select2-drop-mask", "css:finder"],
//        ["xpath=//div[@id='select2-drop-mask']", "xpath:attributes"],
//        ["xpath=//body/div[5]", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "ba1bda38-f61e-4f74-a440-48c6b0218a27",
//      "comment": "",
//      "command": "click",
//      "target": "css=.lang-ru",
//      "targets": [
//        ["css=.lang-ru", "css:finder"],
//        ["xpath=//body", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "c3d2a7fd-a4a1-4f78-8b24-050f88adf3a4",
//      "comment": "",
//      "command": "mouseDown",
//      "target": "css=.company-container .select2-choice",
//      "targets": [
//        ["css=#s2id_crm_project_contactMain-uid-619d58ee58dd4 > .select2-choice", "css:finder"],
//        ["xpath=(//a[@onclick='return false;'])[2]", "xpath:attributes"],
//        ["xpath=//div[@id='s2id_crm_project_contactMain-uid-619d58ee58dd4']/a", "xpath:idRelative"],
//        ["xpath=(//a[contains(@href, 'javascript:void(0)')])[5]", "xpath:href"],
//        ["xpath=//div[4]/div/div[2]/div/a", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "0ebb1a19-c615-477e-aae5-559a8cc1e245",
//      "comment": "",
//      "command": "mouseUp",
//      "target": "id=select2-drop-mask",
//      "targets": [
//        ["id=select2-drop-mask", "id"],
//        ["css=#select2-drop-mask", "css:finder"],
//        ["xpath=//div[@id='select2-drop-mask']", "xpath:attributes"],
//        ["xpath=//body/div[6]", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "6c017be8-ba7a-4b4a-b1c9-3a55d5ead41a",
//      "comment": "",
//      "command": "click",
//      "target": "css=.lang-ru",
//      "targets": [
//        ["css=.lang-ru", "css:finder"],
//        ["xpath=//body", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "27390125-f186-4005-ac51-614aa3d295de",
//      "comment": "",
//      "command": "runScript",
//      "target": "window.scrollTo(0,0)",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "25a4e6ba-917f-416a-8e1e-62a8696c473c",
//      "comment": "",
//      "command": "click",
//      "target": "xpath=//select[@name=\"crm_project[businessUnit]\"]",
//      "targets": [
//        ["id=crm_project_businessUnit-uid-619d58ee2ad83", "id"],
//        ["name=crm_project[businessUnit]", "name"],
//        ["css=#crm_project_businessUnit-uid-619d58ee2ad83", "css:finder"],
//        ["xpath=//select[@id='crm_project_businessUnit-uid-619d58ee2ad83']", "xpath:attributes"],
//        ["xpath=//div[@id='uniform-crm_project_businessUnit-uid-619d58ee2ad83']/select", "xpath:idRelative"],
//        ["xpath=//div[5]/div[2]/div/select", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "28186234-c6c9-435c-b61f-775cc967ba52",
//      "comment": "",
//      "command": "select",
//      "target": "xpath=//select[@name=\"crm_project[businessUnit]\"]",
//      "targets": [],
//      "value": "label=Research & Development"
//    }, {
//      "id": "f8e11244-b92f-46e4-926f-05f484006019",
//      "comment": "",
//      "command": "click",
//      "target": "xpath=//select[@name=\"crm_project[curator]\"]",
//      "targets": [
//        ["id=crm_project_curator-uid-619d58ee545f3", "id"],
//        ["name=crm_project[curator]", "name"],
//        ["css=#crm_project_curator-uid-619d58ee545f3", "css:finder"],
//        ["xpath=//select[@id='crm_project_curator-uid-619d58ee545f3']", "xpath:attributes"],
//        ["xpath=//div[@id='uniform-crm_project_curator-uid-619d58ee545f3']/select", "xpath:idRelative"],
//        ["xpath=//div[6]/div[2]/div/select", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "4e68d302-421d-40ed-b6a9-1c2eaf51746e",
//      "comment": "",
//      "command": "select",
//      "target": "xpath=//select[@name=\"crm_project[curator]\"]",
//      "targets": [],
//      "value": "label=Ким Юрий"
//    }, {
//      "id": "7a6ddc6e-e3f9-4c55-b1c6-03daeafd7d77",
//      "comment": "",
//      "command": "click",
//      "target": "xpath=//select[@name=\"crm_project[rp]\"]",
//      "targets": [
//        ["id=crm_project_rp-uid-619d58ee4b486", "id"],
//        ["name=crm_project[rp]", "name"],
//        ["css=#crm_project_rp-uid-619d58ee4b486", "css:finder"],
//        ["xpath=//select[@id='crm_project_rp-uid-619d58ee4b486']", "xpath:attributes"],
//        ["xpath=//div[@id='uniform-crm_project_rp-uid-619d58ee4b486']/select", "xpath:idRelative"],
//        ["xpath=//div[7]/div[2]/div/select", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "14fddfc8-a8a1-441b-8da8-8868d371a856",
//      "comment": "",
//      "command": "select",
//      "target": "xpath=//select[@name=\"crm_project[rp]\"]",
//      "targets": [],
//      "value": "label=Гумённый Пётр"
//    }, {
//      "id": "b619e91a-880b-4bd7-bc44-1a230e9570e3",
//      "comment": "",
//      "command": "click",
//      "target": "xpath=//select[@name=\"crm_project[manager]\"]",
//      "targets": [
//        ["id=crm_project_manager-uid-619d58ee36b89", "id"],
//        ["name=crm_project[manager]", "name"],
//        ["css=#crm_project_manager-uid-619d58ee36b89", "css:finder"],
//        ["xpath=//select[@id='crm_project_manager-uid-619d58ee36b89']", "xpath:attributes"],
//        ["xpath=//div[@id='uniform-crm_project_manager-uid-619d58ee36b89']/select", "xpath:idRelative"],
//        ["xpath=//div[9]/div[2]/div/select", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "5fa8419f-a549-49e1-bd10-0a2439ef0a70",
//      "comment": "",
//      "command": "select",
//      "target": "xpath=//select[@name=\"crm_project[manager]\"]",
//      "targets": [],
//      "value": "label=Антонов Дмитрий"
//    }, {
//      "id": "46c60444-2d6d-42ac-ba7d-487bab8814cf",
//      "comment": "",
//      "command": "click",
//      "target": "css=.btn-group:nth-child(4) > .btn",
//      "targets": [
//        ["css=.btn-group:nth-child(4) > .btn", "css:finder"],
//        ["xpath=(//button[@type='submit'])[4]", "xpath:attributes"],
//        ["xpath=//form[@id='crm_project-uid-619d58ee6c405']/div/div/div/div[2]/div/div[4]/button", "xpath:idRelative"],
//        ["xpath=//div[4]/button", "xpath:position"],
//        ["xpath=//button[contains(.,'Сохранить и закрыть')]", "xpath:innerText"]
//      ],
//      "value": ""
//    }, {
//      "id": "5da0829c-1683-4051-a328-2ecf06f121b5",
//      "comment": "",
//      "command": "type",
//      "target": "xpath=//input[@name=\"crm_project[name]\"]",
//      "targets": [
//        ["id=crm_project_name-uid-619d5932b8e22", "id"],
//        ["name=crm_project[name]", "name"],
//        ["css=#crm_project_name-uid-619d5932b8e22", "css:finder"],
//        ["xpath=//input[@id='crm_project_name-uid-619d5932b8e22']", "xpath:attributes"],
//        ["xpath=//form[@id='crm_project-uid-619d593335f34']/div[2]/div[3]/div/div/div[2]/fieldset/div/div/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div/div/div[2]/input", "xpath:position"]
//      ],
//      "value": "Smth1"
//    }, {
//      "id": "507d9242-239f-4aae-90f2-4e435cb2692e",
//      "comment": "",
//      "command": "click",
//      "target": "css=.btn-group:nth-child(4) > .btn",
//      "targets": [
//        ["css=.btn-group:nth-child(4) > .btn", "css:finder"],
//        ["xpath=(//button[@type='submit'])[4]", "xpath:attributes"],
//        ["xpath=//form[@id='crm_project-uid-619d593335f34']/div/div/div/div[2]/div/div[4]/button", "xpath:idRelative"],
//        ["xpath=//div[4]/button", "xpath:position"],
//        ["xpath=//button[contains(.,'Сохранить и закрыть')]", "xpath:innerText"]
//      ],
//      "value": ""
//    }, {
//      "id": "b3728f41-3a85-4fd6-ade7-b79e29b499e6",
//      "comment": "",
//      "command": "close",
//      "target": "",
//      "targets": [],
//      "value": ""
//    }]
//  }, {
//    "id": "4a047a65-fa65-4335-8a9b-86cb9c70f604",
//    "name": "test2",
//    "commands": [{
//      "id": "9d5855ac-24b7-4ca2-9725-a35461043a8e",
//      "comment": "",
//      "command": "open",
//      "target": "https://crm.geekbrains.space/user/login",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "73da4611-dccb-4a7f-a7bc-28e8d4964cde",
//      "comment": "",
//      "command": "setWindowSize",
//      "target": "704x566",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "a8e0a263-645c-4325-9c96-5e03e85f05a4",
//      "comment": "",
//      "command": "click",
//      "target": "id=prependedInput",
//      "targets": [
//        ["id=prependedInput", "id"],
//        ["name=_username", "name"],
//        ["css=#prependedInput", "css:finder"],
//        ["xpath=//input[@id='prependedInput']", "xpath:attributes"],
//        ["xpath=//form[@id='login-form']/fieldset/div/input", "xpath:idRelative"],
//        ["xpath=//input", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "80c66e92-445c-44ef-aca3-eab030d9b4c8",
//      "comment": "",
//      "command": "type",
//      "target": "id=prependedInput",
//      "targets": [
//        ["id=prependedInput", "id"],
//        ["name=_username", "name"],
//        ["css=#prependedInput", "css:finder"],
//        ["xpath=//input[@id='prependedInput']", "xpath:attributes"],
//        ["xpath=//form[@id='login-form']/fieldset/div/input", "xpath:idRelative"],
//        ["xpath=//input", "xpath:position"]
//      ],
//      "value": "Applanatest1"
//    }, {
//      "id": "c721ebb7-f8bd-47be-ab55-c177cc84613b",
//      "comment": "",
//      "command": "click",
//      "target": "id=prependedInput2",
//      "targets": [
//        ["id=prependedInput2", "id"],
//        ["name=_password", "name"],
//        ["css=#prependedInput2", "css:finder"],
//        ["xpath=//input[@id='prependedInput2']", "xpath:attributes"],
//        ["xpath=//form[@id='login-form']/fieldset/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div[2]/input", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "30b4c43a-59ff-4156-9042-0978c525bbde",
//      "comment": "",
//      "command": "type",
//      "target": "id=prependedInput2",
//      "targets": [
//        ["id=prependedInput2", "id"],
//        ["name=_password", "name"],
//        ["css=#prependedInput2", "css:finder"],
//        ["xpath=//input[@id='prependedInput2']", "xpath:attributes"],
//        ["xpath=//form[@id='login-form']/fieldset/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div[2]/input", "xpath:position"]
//      ],
//      "value": "Student2020!"
//    }, {
//      "id": "f4f531dc-357a-4fe1-b173-7141cc4eb19a",
//      "comment": "",
//      "command": "click",
//      "target": "css=button[type=submit]",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "f89f8bc9-5931-4c24-bbe2-0ca4eebbce90",
//      "comment": "",
//      "command": "mouseOver",
//      "target": "css=#main-menu > ul > li.dropdown.first > a > span",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "834c84e1-8882-4bc4-b7d6-437e6792ff55",
//      "comment": "",
//      "command": "click",
//      "target": "css=.first .last .title",
//      "targets": [
//        ["css=.first .last .title", "css:finder"],
//        ["xpath=//div[@id='main-menu']/ul/li/ul/li[4]/a/span", "xpath:idRelative"],
//        ["xpath=//li[4]/a/span", "xpath:position"],
//        ["xpath=//span[contains(.,'Контактные лица')]", "xpath:innerText"]
//      ],
//      "value": ""
//    }, {
//      "id": "f82702c2-32ae-42f1-9f32-5b42d4275beb",
//      "comment": "",
//      "command": "click",
//      "target": "linkText=Создать контактное лицо",
//      "targets": [
//        ["linkText=Создать контактное лицо", "linkText"],
//        ["css=.back", "css:finder"],
//        ["xpath=(//a[contains(text(),'Создать контактное лицо')])[3]", "xpath:link"],
//        ["xpath=//div[@id='container']/div/div/div/div[2]/div/div/a", "xpath:idRelative"],
//        ["xpath=(//a[contains(@href, '/contact/create')])[3]", "xpath:href"],
//        ["xpath=//div[2]/div/div/a", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "70add700-9b3d-41c1-bd2b-d04b3ca53aaf",
//      "comment": "",
//      "command": "type",
//      "target": "xpath=//input[@name=\"crm_contact[lastName]\"]",
//      "targets": [
//        ["id=crm_contact_lastName-uid-619d6593774c7", "id"],
//        ["name=crm_contact[lastName]", "name"],
//        ["css=#crm_contact_lastName-uid-619d6593774c7", "css:finder"],
//        ["xpath=//input[@id='crm_contact_lastName-uid-619d6593774c7']", "xpath:attributes"],
//        ["xpath=//form[@id='crm_contact-uid-619d6593830ab']/div[2]/div[3]/div/div/div[2]/fieldset/div/div/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div/div/div[2]/input", "xpath:position"]
//      ],
//      "value": "Koltunov"
//    }, {
//      "id": "bbe74cac-a12a-4e8a-a94f-98da95a56a29",
//      "comment": "",
//      "command": "click",
//      "target": "xpath=//input[@name=\"crm_contact[lastName]\"]",
//      "targets": [
//        ["id=crm_contact_firstName-uid-619d659377400", "id"],
//        ["name=crm_contact[firstName]", "name"],
//        ["css=#crm_contact_firstName-uid-619d659377400", "css:finder"],
//        ["xpath=//input[@id='crm_contact_firstName-uid-619d659377400']", "xpath:attributes"],
//        ["xpath=//form[@id='crm_contact-uid-619d6593830ab']/div[2]/div[3]/div/div/div[2]/fieldset/div/div[2]/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div[2]/div[2]/input", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "9ab9454f-c713-4e18-956a-1c52ce42da4f",
//      "comment": "",
//      "command": "type",
//      "target": "xpath=//input[@name=\"crm_contact[firstName]\"]",
//      "targets": [
//        ["id=crm_contact_firstName-uid-619d659377400", "id"],
//        ["name=crm_contact[firstName]", "name"],
//        ["css=#crm_contact_firstName-uid-619d659377400", "css:finder"],
//        ["xpath=//input[@id='crm_contact_firstName-uid-619d659377400']", "xpath:attributes"],
//        ["xpath=//form[@id='crm_contact-uid-619d6593830ab']/div[2]/div[3]/div/div/div[2]/fieldset/div/div[2]/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div[2]/div[2]/input", "xpath:position"]
//      ],
//      "value": "Aleksandr"
//    }, {
//      "id": "da2a3ac6-8886-4aad-8080-10215505fb0c",
//      "comment": "",
//      "command": "mouseDown",
//      "target": "css=.select2-chosen",
//      "targets": [
//        ["css=.select2-chosen", "css:finder"],
//        ["xpath=//div[@id='s2id_crm_contact_company-uid-619d65937c8c3']/a/span", "xpath:idRelative"],
//        ["xpath=//div/a/span", "xpath:position"],
//        ["xpath=//span[contains(.,'Укажите организацию')]", "xpath:innerText"]
//      ],
//      "value": ""
//    }, {
//      "id": "5a21c227-b0bd-4886-a2e7-95127b7c9396",
//      "comment": "",
//      "command": "mouseUp",
//      "target": "id=select2-drop-mask",
//      "targets": [
//        ["id=select2-drop-mask", "id"],
//        ["css=#select2-drop-mask", "css:finder"],
//        ["xpath=//div[@id='select2-drop-mask']", "xpath:attributes"],
//        ["xpath=//body/div[6]", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "e9f36add-33f0-4abe-b984-f45891eeb168",
//      "comment": "",
//      "command": "click",
//      "target": "css=.lang-ru",
//      "targets": [
//        ["css=.lang-ru", "css:finder"],
//        ["xpath=//body", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "b9cc34f2-8f2b-4d08-97d4-2a0e381c5b50",
//      "comment": "",
//      "command": "runScript",
//      "target": "window.scrollTo(0,0)",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "a5df2000-0424-491b-a839-0ec598591e30",
//      "comment": "",
//      "command": "runScript",
//      "target": "window.scrollTo(0,0)",
//      "targets": [],
//      "value": ""
//    }, {
//      "id": "a4224357-786f-4f90-bd8f-f4540a92a95a",
//      "comment": "",
//      "command": "click",
//      "target": "xpath=//div[@id=\"select2-drop-mask\"]",
//      "targets": [
//        ["id=crm_contact_jobTitle-uid-619d659377652", "id"],
//        ["name=crm_contact[jobTitle]", "name"],
//        ["css=#crm_contact_jobTitle-uid-619d659377652", "css:finder"],
//        ["xpath=//input[@id='crm_contact_jobTitle-uid-619d659377652']", "xpath:attributes"],
//        ["xpath=//form[@id='crm_contact-uid-619d6593830ab']/div[2]/div[3]/div/div/div[2]/fieldset/div[2]/div[2]/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div[2]/div[2]/div[2]/input", "xpath:position"]
//      ],
//      "value": ""
//    }, {
//      "id": "84d127cd-717f-4ae6-9cf1-3baa62c92abf",
//      "comment": "",
//      "command": "type",
//      "target": "xpath=//input[@name=\"crm_contact[jobTitle]\"]",
//      "targets": [
//        ["id=crm_contact_jobTitle-uid-619d659377652", "id"],
//        ["name=crm_contact[jobTitle]", "name"],
//        ["css=#crm_contact_jobTitle-uid-619d659377652", "css:finder"],
//        ["xpath=//input[@id='crm_contact_jobTitle-uid-619d659377652']", "xpath:attributes"],
//        ["xpath=//form[@id='crm_contact-uid-619d6593830ab']/div[2]/div[3]/div/div/div[2]/fieldset/div[2]/div[2]/div[2]/input", "xpath:idRelative"],
//        ["xpath=//div[2]/div[2]/div[2]/input", "xpath:position"]
//      ],
//      "value": "Programmer"
//    }, {
//      "id": "20f66e1d-e981-4ba5-afc0-3132872fdfdb",
//      "comment": "",
//      "command": "click",
//      "target": "css=.btn-group:nth-child(4) > .btn",
//      "targets": [
//        ["css=.btn-group:nth-child(4) > .btn", "css:finder"],
//        ["xpath=(//button[@type='submit'])[4]", "xpath:attributes"],
//        ["xpath=//form[@id='crm_contact-uid-619d6593830ab']/div/div/div/div[2]/div/div[4]/button", "xpath:idRelative"],
//        ["xpath=//div[4]/button", "xpath:position"],
//        ["xpath=//button[contains(.,'Сохранить и закрыть')]", "xpath:innerText"]
//      ],
//      "value": ""
//    }, {
//      "id": "833e53b7-f230-4fa1-8cd9-58691257238b",
//      "comment": "",
//      "command": "close",
//      "target": "",
//      "targets": [],
//      "value": ""
//    }]
//  }],
//  "suites": [{
//    "id": "5398b96b-05e1-4bfd-b9db-f1eac62688ce",
//    "name": "Default Suite",
//    "persistSession": false,
//    "parallel": false,
//    "timeout": 300,
//    "tests": ["2d507858-456f-4224-b11e-d9baa714c42b"]
//  }],
//  "urls": ["https://crm.geekbrains.space/user/login"],
//  "plugins": []
//}
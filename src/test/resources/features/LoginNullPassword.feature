#Created by Emre ÖRS
#Date 22.04.2022

Feature: login functionality test with valid credentials

  Scenario: Check domainAdresi login screen
    Given kullanici domainAdresi anasayfasina erisir
    And ana sayfada giris yap butonu goruntulenir
    When kullanici giris yap butonuna tiklar
    Then kullanici login sayfasina yonlendirilir

  Scenario: Check login username
    Given kullanici login sayfasina erisir
    When kullanici gecerli bir kullanici adi girer "emre.smfc@gmail.com"
    And kullanici username icin giris yap butonuna tiklar
    Then kullanici Password sayfasina yonlendirilir

  Scenario: Check login password
    Given kullanici password sayfasina erisir
    And kullanici password icin giris yap butonu deaktiftir
    When kullanici null bir password girer ""
    And  kullanici sifre textBoxina tiklar
    And kullanici sifre textBoxi disinda bir alana tiklar
    Then sistem null sifre mesaji doner
    And textboxPlaceHolder null sifre mesaji doner




Feature:Kullanici Concort Hotel database'ini test eder.
  Scenario: TC18 Concort Hotel Database readtest

    Given Kullanici CHQA database'ine bağlanır.
    And  kullanici "tHOTELROOM"tablosundaki "price" verilerini alır.
    And  kullanici "price"sütunundaki verileri okur ve istediği işlemleri yapar
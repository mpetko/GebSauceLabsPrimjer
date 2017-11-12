package functionaltest.specs

import functionaltest.pages.GooglePage
import functionaltest.pages.OdjelZaInfHomePage
import functionaltest.pages.OdjelZaInfOodjeluPage

import org.openqa.selenium.Keys
import spock.lang.Stepwise

@Stepwise
class ProvjeraPodatakaOdjelZaInfTest extends BasePageGebSpec {
   private static final String PRETRAZI_ODJEL_ZA_INF = "odjel za informatiku rijeka"

   def "Provjera osnovnih podataka na web stranici Odjela za informatiku"() {
      when: "Otvaranje Google.hr web stranice"
      to GooglePage

      then: "Provjera otvorene stranice - Google.hr"
      at GooglePage

      when: "Unos i pretraga trazenog pojma u trazilici"
      searchBar.value(PRETRAZI_ODJEL_ZA_INF) << Keys.ENTER

      and: "Klik na prvi rezulat pretrage"
      prviRezultatPretrage.click()

      then: "Provjera otvorene stranice - inf.uniri.hr/"
      at OdjelZaInfHomePage

      when: "Klik na meni link 'O odjelu' "
      oOdjeluLink.click()

      then: "Provjera osnovnih podataka"
      at OdjelZaInfOodjeluPage

      //metoda provjerava ispravnost adrese, telefona, emiala, ibana i oiba
      provjeraOsnovnihPodataka()
   }
}

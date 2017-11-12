package functionaltest.pages

import geb.Page

class OdjelZaInfEngleskiHomePage extends Page {
   private static final ODJEL_ZA_INF_NASLOV = "Odjel za informatiku - Home page"

   static url = "http://www.inf.uniri.hr/en/"
   static at = { title == ODJEL_ZA_INF_NASLOV }
   static atCheckWaiting = true

   static content = {
      porukaDobrodoslice1(wait:true) { $('span', id: 'result_box').$('span', class: 'hps', 0) }
      porukaDobrodoslice2(wait:true) { $('span', id: 'result_box').$('span', class: 'hps', 1) }
   }
}

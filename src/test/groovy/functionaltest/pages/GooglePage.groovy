package functionaltest.pages

import geb.Page

class GooglePage extends Page {
   static url = "http://www.google.hr"
   static at = { title == "Google" }
   static atCheckWaiting = true

   static content = {
      searchBar(wait: true) { $('input', id: 'lst-ib') }

      prviRezultatPretrage(wait: true) { $('div', id: 'ires').$('a', 0) }
   }
}

package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

  /**
   * Testuje metodu {@link Svatky#kdyMaSvatek(String)}
   */
  @Test
  void kdyMaSvatek() {
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Nataša"));
    assertNull(svatky.kdyMaSvatek("Eva"));
  }

  /**
   * Testuje metodu {@link Svatky#jeVSeznamu(String)}
   */
  @Test
  void jeVSeznamu() {
    //TODO Otestovat, že najde v seznamu existující jméno a nenajde neexistující jméno
    Svatky svatky = new Svatky();

    assertTrue(svatky.jeVSeznamu("Nataša"));
    assertFalse(svatky.jeVSeznamu("Eva"));
    assertFalse(svatky.jeVSeznamu("Edynfgdhgoiysg"));
  }

  /**
   * Testuje metodu {@link Svatky#getPocetJmen()}
   */
  @Test
  void getPocetJmen() {
    //TODO Otestovat, že vrací počet jmen, která máme v seznamu
    Svatky svatky = new Svatky();
    int pocet = svatky.getPocetJmen();
    assertEquals(37,pocet);
  }

  /**
   * Testuje metodu {@link Svatky#getSeznamJmen()}
   */
  @Test
  void getSeznamJmen() {
    //TODO Zkontrolovat, že seznam jmen má správný počet položek.
    Svatky svatky = new Svatky();
    int pocet = svatky.getSeznamJmen().size();
    assertEquals(37,pocet);
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, int)}
   */
  @Test
  void pridatSvatekDenMesicInt() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Alex", 5, 3);
    assertEquals(MonthDay.of(5, 3), svatky.kdyMaSvatek("Alex"));



  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, Month)}
   */
  @Test
  void pridatSvatekDenMesicMonth() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Františka", 3, 9);
    assertEquals(MonthDay.of(3, 9), svatky.kdyMaSvatek("Františka"));
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, MonthDay)}
   */
  @Test
  void prridatSvatekMonthDay() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Dejan", 6, 24);
    assertEquals(MonthDay.of(6, 24), svatky.kdyMaSvatek("Dejan"));
  }

  /**
   * Testuje metodu {@link Svatky#smazatSvatek(String)}
   */
  @Test
  void smazatSvatek() {
    //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
    Svatky svatky = new Svatky();
    svatky.smazatSvatek("Emil");
    assertFalse(svatky.jeVSeznamu("Emil"));
    int pocet = svatky.getPocetJmen();
    assertEquals(36,pocet);

  }
}

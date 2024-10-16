# Tahák: Vláken (Threads) v Javě

## 1. Základy Vláken
- **Vlákno (Thread)**: Jednotková část procesu, která může být vykonávána nezávisle.
- **Životní cyklus**: Vláka může být ve stavech: Nové, Běžící, Čekající, Zablokované, Ukončené.

## 2. Vytváření Vláken
- **Metoda 1**:
-  Rozšířením třídy `Thread`
    class MojeVlako extends Thread {
        public void run() {
            // Kód, který se provede ve vlákně
        }
    }

- **Metoda 2**:
- Implementací rozhraní `Runnable`
    class MojeUloha implements Runnable {
        public void run() {
            // Kód, který se provede ve vlákně
        }
    }

## 3. Synchronizace
- **Synchronized Block**: Zajišťuje, že pouze jedno vlákno může provádět určitou část kódu.
    synchronized (this) {
        // Kód, který se má synchronizovat
    }

## 4. Čekání a Probuzení
- **wait()** a **notify()**: Umožňují jednomu vláknu čekat na určitou podmínku a jinému vláknu ho probudit.
    - `wait()`: Uvolní zámek a čeká.
    - `notify()`: Probouzí jedno čekající vlákno.
    - `notifyAll()`: Probouzí všechna čekající vlákna.

## 5. Deadlock
- **Definice**: Situace, kdy se dvě nebo více vláken navzájem blokují, protože každé čeká na zdroj, který drží to druhé.
- **Prevence**: Použití `tryLock()` s `ReentrantLock`, které umožňuje pokusit se o zámek bez zablokování.

## 6. Bezpečné Ukončení Vláken
- **Příznaková Proměnná (`volatile boolean`)**: Vlákno kontroluje tuto proměnnou, aby se rozhodlo, kdy má skončit.
- **`interrupt()`**: Používá se pro přerušení blokovaných operací. Vyvolává `InterruptedException`, pokud je vlákno ve stavu čekání.
- **ExecutorService**: Pro správu vláken. `shutdown()` a `shutdownNow()` pro ukončení běžících vláken.

## 7. Vysvětlení Klíčových Termínů
- **`volatile`**: Zajišťuje, že vlákna vždy vidí nejnovější hodnotu proměnné.
- **`join()`**: Hlavní vlákno čeká, až se další vlákno dokončí.
- **`tryLock()`**: Pokusí se získat zámek, aniž by se zablokovalo.

## 8. Shrnutí Odpovědí na Otázky
- **Deadlock**: Nastane, když dvě vlákna čekají na zdroje, které drží navzájem.
- **`volatile` vs `interrupt()`**: `volatile` se používá pro kontrolu příznaků, `interrupt()` pro přerušení blokování.
- **`shutdown()` vs `shutdownNow()`**: `shutdown()` ukončuje nové úlohy, `shutdownNow()` se pokouší okamžitě ukončit běžící úlohy.

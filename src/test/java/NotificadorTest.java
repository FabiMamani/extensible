import discovery.Notificador;
import notificadores.Telegram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotificadorTest {

    @Test
    public void test(){
        Notificador not = new Telegram();
        String msjEsperado = "Notificación generada por Telegram";
        Assertions.assertEquals(msjEsperado, not.notify("Telegram"));
    }
}

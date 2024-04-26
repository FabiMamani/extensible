import discovery.Notificador;
import notificadores.Telegram;
import notificadores.Whastapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotificadorTest {

    @Test
    public void telegramtest(){
        Notificador not = new Telegram();
        String msjEsperado = "Notificación generada por Telegram";
        Assertions.assertEquals(msjEsperado, not.notify("Telegram"));
    }
    @Test
    public void whatsapptest(){
        Notificador not = new Whastapp();
        String msjEsperado = "Notificación generada por Whastapp";
        Assertions.assertEquals(msjEsperado, not.notify("Whastapp"));
    }

}

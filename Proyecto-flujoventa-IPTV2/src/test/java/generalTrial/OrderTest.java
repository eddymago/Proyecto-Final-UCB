package generalTrial;

import actions.Label;
import conf.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.trial.AdduserPage;
import task.addReseller.Reseller;
import task.addReseller.SelectReseller;
import task.addTicket.SelectTicket;
import task.addTicket.Ticket;
import task.addUser.AddUserFInal;
import task.addUser.User;
import task.generalTrial.AddUser;
import page.trial.AdduserPage;
import task.generalTrial.Trial;
import task.addUser.Modif;
import task.addUser.PageModf;
import task.login.Login;


public class OrderTest extends BaseTest {

    @Test(description = "Prueba de venta IPTV")
    public void testOrder1() throws InterruptedException {
        // login
        Login.ingresarCredenciales(driver);
        // seleccionar usuario
         Trial.selectuser(driver);
        // adicionar usuario de prueba
        AddUser.adduser(driver);
        Assert.assertTrue(Label.getLabelIsDiplayed(driver, AdduserPage.mensajeexitoso));
        Thread.sleep(5000);
    }
    @Test(description = "Usuario FInal")
    public void testOrder2() throws InterruptedException {
        // login
        Login.ingresarCredenciales(driver);
        // seleccionar usuario final
        User.selectusers(driver);
        //añadir usuario final
        AddUserFInal.adduserfinal(driver);
        Assert.assertTrue(Label.getLabelIsDiplayed(driver, AdduserPage.mensajeexitoso));
        Thread.sleep(5000);
    }

    @Test(description = "editar Usuario")
    public void testOrder3() throws InterruptedException {
        // login
        Login.ingresarCredenciales(driver);
        //seleccionar usuarios
        Modif.selectusers(driver);
        //editar usuario,descargar,bloquear y desbloquear usuario
        PageModf.edit(driver);
        Thread.sleep(5000);
    }
    @Test(description = "add reseller")
    public void testOrder4() throws InterruptedException {
        // login
        Login.ingresarCredenciales(driver);
        // seleccionarreseller
        SelectReseller.seleccionreseller(driver);
        //addreseller
        Reseller.selectresellers(driver);
        Thread.sleep(5000);

    }
    @Test(description = "Generar nota de reclamo")
    public void testOrder5() throws InterruptedException {
        // login
        Login.ingresarCredenciales(driver);
        //seleccionar support
        SelectTicket.seleccionticket(driver);
        //crear el ticket
        Ticket.ingresarReclamo(driver);
        Thread.sleep(5000);
    }
}



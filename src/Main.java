import Observer.Button;
import Observer.IButtonListener;
import Strategy.*;
import adapter.*;
import aop.AopBrowser;
import decorator.*;
import facade.Ftp;
import facade.Reader;
import facade.SftpClient;
import facade.Writer;
import proxy.Browser;
import proxy.BrowserProxy;
import proxy.IBrowser;
import singleton.Aclazz;
import singleton.Bclazz;
import singleton.SocketClient;

import javax.crypto.spec.PSource;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        /*
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();



        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();


        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now  - start.get());
                }
                );
        aopBrowser.show();
        System.out.println("loading time: " + end.get());

        aopBrowser.show();
        System.out.println("loading time: " + end.get());



    }

        Aclazz aClazz = new Aclazz();
        Bclazz bClazz = new Bclazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가");
        System.out.println(aClient.equals(bClient));

        //Adapter
        /*HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();

        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3

        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        // a4

        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        // a5

        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();


//버튼
        Button button = new Button("버튼");

        button.addListner(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메시지 전달 : click1");
        button.click("메시지 전달 : click2");
        button.click("메시지 전달 : click3");
        button.click("메시지 전달 : click4");
        button.click("메시지 전달 : click5");

*/

        /*
        Ftp ftpclient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpclient.conncect();
        ftpclient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpclient.disConnect();*/


        //facade
        /*
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();

        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();
*/
        Encoder encoder = new Encoder();

        //base64

        EncodingStrategy base64 = new Base64Strategy();

        //normal

        EncodingStrategy normal = new NormalStrategy();

        //Append

        EncodingStrategy append = new AppendStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64result = encoder.getMessage(message);
        System.out.println(base64result);

        encoder.setEncodingStrategy(normal);
        String normalResult =  encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(append);
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }

}

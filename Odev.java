import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Odev {
	
	//tabloyu rasgele bir biçimde oluþtur
		public void TabloOlustur(int k,int users){
			File f=new File("C:/Users/emre/Downloads/eclipse-SDK-4.2.2-win32-x86_64/eclipse/tablo1.txt");
			PrintWriter writer = null;
			try {
				writer=new PrintWriter(f,"UTF-8");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//header satýrýný ekle
			String line="";
			for(int i=0;i<k;i++){
				line=line+"  "+"header-"+(i+1);
				writer.print(line);
				line="";
			}
			//1 ve 0 satýrlarýný ekle
			for(int i=0;i<users;i++){
				String satir="";
				writer.println();
				for(int j=0;j<k;j++){
					Random r=new Random();
					satir=satir+(r.nextInt(2));
					writer.print(satir);
					satir="";
				}
			}
			writer.close();
		}
		
	public String[] Kumele(int t,int k){
		BufferedReader br = null;
		String line = null;
		String[] headers=new String[2];
		int ikili1=0,ikili2=0,eb_ikili=0,kisi_sayisi = 0,gecici_kisi_sayisi=0;
		for(int i=0;i<t-1;i++){
			for(int j=i+1;j<t;j++){
				try {
					br=new BufferedReader(new FileReader("C:/Users/emre/Downloads/eclipse-SDK-4.2.2-win32-x86_64/eclipse/tablo1.txt"));
					line=br.readLine();
				}
				catch (FileNotFoundException e) {}
				catch (IOException e) {}
				
				int ikili=0;
				while(line!=null){
					try {
						line=br.readLine();
						if(line==null)break;
						char c1=line.charAt(i);
						char c2= line.charAt(j);
						if(c1=='1' && c2=='1'){
							ikili++;
							gecici_kisi_sayisi++;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(eb_ikili<ikili){
					ikili1=i;
					ikili2=j;
					eb_ikili=ikili;
					kisi_sayisi=gecici_kisi_sayisi;
				}
				gecici_kisi_sayisi=0;
			}
		}
		System.out.println(kisi_sayisi+" Kisi bu iki urunu almýþtýr.");
		headers[0]="header-"+(ikili1+1);
		headers[1]="header-"+(ikili2+1);
		return headers;
	}
	public static void main(String[] args) {
		Odev o=new Odev();
		o.TabloOlustur(10, 1000);
		String[] s=o.Kumele(4, 1000);
		for(int i=0;i<2;i++){
			if(s[i]!=null)
				System.out.println(s[i]);
		}
	}
}

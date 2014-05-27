import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume0016 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputStr;
		double posiX = 0, posiY = 0; //　進む方向をｘ軸とｙ軸で記録
		double radian = Math.toRadians(90);  //角度が出たら取りあえずradianにしとけ！！
		while(!(inputStr = reader.readLine()).equals("0,0")){
			double distance = Double.parseDouble(inputStr.split(",")[0]); //動いた距離
			double curve = Double.parseDouble(inputStr.split(",")[1]); //その後に回る角度
			posiX += distance * Math.cos(radian); // 余弦
			posiY += distance * Math.sin(radian); //　正弦
            if (curve < 0) { //　ここが分からん、、、　角度が-180～0なら
                radian += Math.toRadians(curve * -1);
            } else {
                radian -= Math.toRadians(curve);
            }
		}
		posiX =( posiX >= 0 ) ? Math.floor(posiX) : Math.ceil(posiX);//繰り上げと繰り下げ
        posiY =( posiY >= 0 ) ? Math.floor(posiY) : Math.ceil(posiY);
        System.out.printf("%.0f\n", posiX);
        System.out.printf("%.0f\n", posiY);
	}

}

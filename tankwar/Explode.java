package tankwar;
import java.awt.*;

/**
 * ��ը��
 * @author xh_huang
 *
 */
public class Explode {

	
	int x,y;
	private boolean live = true;
	
	//��ը��Բ��ֱ������
	int[] diameter = {4,15,17,37,15};
	
	int step = 0;
	
	private TankClient tc;
	
	/**
	 * ��ʼ��explode
	 * @param x ������
	 * @param y ������
	 * @param tc TankClient������
	 */
	public Explode(int x,int y,TankClient tc) {
		this.x = x;
		this.y = y;
		this.tc = tc;	
	}
	
	/**
	 * ������ը��Ч��
	 * @param g Graphics��
	 */
	public void draw(Graphics g) {
		if(!live) {
			tc.explodes.remove(this);
			return;
		}
	
		if(step== diameter.length) {
			live = false;
			step = 0;
			return;
		}
		Color c = g.getColor();
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, diameter[step], diameter[step]);
		g.setColor(c);
		
		step++;
	}
}

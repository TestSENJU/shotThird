package VO;
/**
 * 
 * @author wyt
 * 0助攻数
 * 1盖帽数
 * 2防守数
 * 3效率
 * 4失误数
 * 5犯规数
 * 6进攻数
 * 7投篮命中率
 * 8得分
 * 9篮板数
 * 10首发次数
 * 11抢断数
 * 11三分命中率
 *
 */
public class PlayerBasicAllVO {
	String name;
	String id;
	int num;
	String time;
	double[] data=new double[13];

	public PlayerBasicAllVO(String id){
		this.id=id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double[] getData() {
		return data;
	}

	public void setData(double[] data) {
		this.data = data;
	}
	
}

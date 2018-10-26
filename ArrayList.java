
public class ArrayList implements List{
	private Object[] arrayList;
	
	ArrayList(){
		arrayList = new Object[10];
	}

	@Override
	public void add(Object obj) {
		if(size() == arrayList.length) {
			doubleSize(obj);
		}
		else {
			arrayList[size()] = obj;
		}
	}

	@Override
	public void add(int pos, Object obj) {
		if(pos > size()) {
			pos = size();
		}
		if(pos == arrayList.length) {
			doubleSize(obj);
		}
		else {
			arrayList[pos] = obj;
		}
	}

	@Override
	public Object get(int pos) {
		return arrayList[pos];
	}

	@Override
	public Object remove(int pos) {
		Object temp = arrayList[pos];
		for(int i = pos; i < size(); i++) {
			if(i + 1 < arrayList.length) {
				arrayList[i] = arrayList[i+1];
			}
			else {
				arrayList[i] = null;
			}
		}
		return temp;
	}

	@Override
	public int size() {
		int count = 0;
		while(count < arrayList.length && arrayList[count] != null) {
			count++;
		}
		System.out.println(count);
		return count;
	}
	
	public void doubleSize(Object obj){
		Object[] temp = new Object[arrayList.length * 2];
		for(int i = 0; i < arrayList.length; i++) {
			temp[i] = arrayList[i];
		}
		arrayList = temp;
		arrayList[size()] = obj;
	}

}

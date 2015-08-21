package action;

import java.util.ArrayList;
import java.util.List;

public class AutoCompleteAction {
	private String name;
	private List<String> names;
	
	public String execute(){
		names = new ArrayList<String>();
		if(name.toLowerCase().startsWith("r")){
			names.add("rama");
			names.add("ramarama");
		}
		if (name.toLowerCase().startsWith("s")) {
			names.add("sitha");
			names.add("sithaLaxi");
		}
		if(name.toLowerCase().startsWith("l")){
			names.add("laxman");
			names.add("laxmanHai");
		}
		
		return "success";
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}

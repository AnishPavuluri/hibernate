package service;

import com.sun.jersey.api.core.PackagesResourceConfig;

public class MyApplication extends PackagesResourceConfig{
	public MyApplication() {
        super("service.StudentService");
    }

}

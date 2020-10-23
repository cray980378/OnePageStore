package com.exapmle.OnePageStoreUI.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.exapmle.OnePageStoreUI.Composer.Store.StorePageComposer;

@Controller
public class StoreController {

	@GetMapping("/store")
	public String test() {
		return StorePageComposer.STORE_PAGE_ZUL ;
	}

}

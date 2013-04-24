package com.appiancorp.plugins.appianworld.advancedplugins;

import localhost._8080.suite.types.PLGAppian;

import org.apache.log4j.Logger;

import com.appiancorp.suiteapi.common.Name;
import com.appiancorp.suiteapi.process.exceptions.SmartServiceException;
import com.appiancorp.suiteapi.process.framework.AppianSmartService;
import com.appiancorp.suiteapi.process.framework.Input;
import com.appiancorp.suiteapi.process.framework.MessageContainer;
import com.appiancorp.suiteapi.process.framework.Required;
import com.appiancorp.suiteapi.process.framework.SmartServiceContext;

import com.appiancorp.suiteapi.process.palette.PaletteInfo; 

@PaletteInfo(paletteCategory = "Integration Services", palette = "Connectivity Services") 
public class ImportedCDTPlugin extends AppianSmartService {

	private static final Logger LOG = Logger.getLogger(ImportedCDTPlugin.class);
	private final SmartServiceContext smartServiceCtx;
	private PLGAppian parameter;
	private PLGAppian returnvalue;

	@Override
	public void run() throws SmartServiceException {

		returnvalue = new PLGAppian();
		returnvalue.setName("imported value: " + parameter.getName());
		
	}

	public ImportedCDTPlugin(SmartServiceContext smartServiceCtx) {
		super();
		this.smartServiceCtx = smartServiceCtx;
	}

	public void onSave(MessageContainer messages) {
	}

	public void validate(MessageContainer messages) {
	}

	@Input(required = Required.OPTIONAL)
	@Name("parameter")
	public void setParameter(PLGAppian val) {
		this.parameter = val;
	}

	@Name("returnvalue")
	public PLGAppian getReturnvalue() {
		return returnvalue;
	}

}

package com.appiancorp.plugins.appianworld.advancedplugins;

import java.util.List;

import javax.xml.namespace.QName;

import localhost._8080.suite.types.PLGAppian;

import org.apache.log4j.Logger;

import com.appiancorp.suiteapi.process.exceptions.SmartServiceException;
import com.appiancorp.suiteapi.process.framework.AppianSmartService;
import com.appiancorp.suiteapi.process.framework.MessageContainer;
import com.appiancorp.suiteapi.process.framework.SmartServiceContext;

import com.appiancorp.suiteapi.process.palette.PaletteInfo; 
import com.appiancorp.suiteapi.type.NamedTypedValue;
import com.appiancorp.suiteapi.type.TypeService;
import com.appiancorp.suiteapi.type.TypedValue;

@PaletteInfo(paletteCategory = "Integration Services", palette = "Connectivity Services") 
public class DynamicCDTInputsNoBaseInputsPlugin extends AppianSmartService {

	private static final Logger LOG = Logger
			.getLogger(DynamicCDTInputsNoBaseInputsPlugin.class);
	private final SmartServiceContext smartServiceCtx;

	private static Long PLG_APPIAN_TYPE_ID;
	
	private List<? extends NamedTypedValue> dynaInputs;
	
	@Override
	public void run() throws SmartServiceException {
		
		PLGAppian castedInput = null;
		
		LOG.error(dynaInputs);
		
		NamedTypedValue input = dynaInputs.get(0);
		
//		for (NamedTypedValue input : dynaInputs) {
//			if (input.getInstanceType() == PLG_APPIAN_TYPE_ID) {
//				castedInput = (PLGAppian) input.getValue();
//			}
//		}

		TypedValue temp = new TypedValue(input);
		
		
		
		
		LOG.error(castedInput.getName());
		
	}

	public DynamicCDTInputsNoBaseInputsPlugin(
			SmartServiceContext smartServiceCtx, TypeService ts) {
		super();
		this.smartServiceCtx = smartServiceCtx;
		
		PLG_APPIAN_TYPE_ID = ts.getTypeByQualifiedName(new QName("http://localhost:8080/suite/types/", "PLG_Appian")).getId();
		
	}

	public void onSave(MessageContainer messages) {
	}

	public void validate(MessageContainer messages) {
	}

	@Override
	public void setDynamicInputs(List<? extends NamedTypedValue> inputs) {
		super.setDynamicInputs(inputs);
		dynaInputs = inputs;
	}

	
	
}

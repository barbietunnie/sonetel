/**
 * Copyright (C) 2010 Regis Montoya (aka r3gis - www.r3gis.fr)
 * This file is part of CSipSimple.
 *
 *  CSipSimple is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  CSipSimple is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CSipSimple.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.csipsimple.wizards;

import java.util.List;

import com.csipsimple.api.SipProfile;
import com.csipsimple.models.Filter;
import com.csipsimple.utils.PreferencesWrapper;

public interface WizardIface {
	void setParent(BasePrefsWizard parent);
	
	
	// Layout stuff
	int getBasePreferenceResource();
	void fillLayout(SipProfile account);
	void updateDescriptions();
	
	String getDefaultFieldSummary(String fieldName);

	// Save
	SipProfile buildAccount(SipProfile account);
	void setDefaultParams(PreferencesWrapper prefs);
	boolean canSave();
	//void startBrowser();
	//boolean isNewUser();
	boolean needRestart();
	public List<Filter> getDefaultFilters(SipProfile acc);
	
}

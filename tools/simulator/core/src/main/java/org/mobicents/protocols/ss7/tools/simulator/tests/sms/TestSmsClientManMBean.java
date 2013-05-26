/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012.
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.protocols.ss7.tools.simulator.tests.sms;

import org.mobicents.protocols.ss7.tools.simulator.common.AddressNatureType;
import org.mobicents.protocols.ss7.tools.simulator.level3.MapProtocolVersion;
import org.mobicents.protocols.ss7.tools.simulator.level3.NumberingPlanMapType;

/**
 *
 * @author sergey vetyutnev
 *
 */
public interface TestSmsClientManMBean {

	public AddressNatureType getAddressNature();

	public String getAddressNature_Value();

	public void setAddressNature(AddressNatureType val);

	public NumberingPlanMapType getNumberingPlan();

	public String getNumberingPlan_Value();

	public void setNumberingPlan(NumberingPlanMapType val);	

	public String getServiceCenterAddress();

	public void setServiceCenterAddress(String val);	

	public MapProtocolVersion getMapProtocolVersion();

	public String getMapProtocolVersion_Value();

	public void setMapProtocolVersion(MapProtocolVersion val);	

	public SRIReaction getSRIReaction();

	public String getSRIReaction_Value();

	public void setSRIReaction(SRIReaction val);	

	public SRIInformServiceCenter getSRIInformServiceCenter();

	public String getSRIInformServiceCenter_Value();

	public void setSRIInformServiceCenter(SRIInformServiceCenter val);	

	public boolean isSRIScAddressNotIncluded();

	public void setSRIScAddressNotIncluded(boolean val);	

	public MtFSMReaction getMtFSMReaction();

	public String getMtFSMReaction_Value();

	public void setMtFSMReaction(MtFSMReaction val);	


	public String getSRIResponseImsi();

	public void setSRIResponseImsi(String val);	

	public String getSRIResponseVlr();

	public void setSRIResponseVlr(String val);	

	public int getSmscSsn();

	public void setSmscSsn(int val);

	public TypeOfNumberType getTypeOfNumber();

	public String getTypeOfNumber_Value();

	public void setTypeOfNumber(TypeOfNumberType val);

	public NumberingPlanIdentificationType getNumberingPlanIdentification();

	public String getNumberingPlanIdentification_Value();

	public void setNumberingPlanIdentification(NumberingPlanIdentificationType val);

	public SmsCodingType getSmsCodingType();

	public String getSmsCodingType_Value();

	public void setSmsCodingType(SmsCodingType val);

	public boolean isOneNotificationFor100Dialogs();

	public void setOneNotificationFor100Dialogs(boolean val);


	public void putAddressNature(String val);

	public void putNumberingPlan(String val);

	public void putMapProtocolVersion(String val);

	public void putSRIReaction(String val);

	public void putSRIInformServiceCenter(String val);

	public void putMtFSMReaction(String val);

	public void putTypeOfNumber(String val);

	public void putNumberingPlanIdentification(String val);

	public void putSmsCodingType(String val);


	public String getCurrentRequestDef();


	public String performMoForwardSM(String msg, String destIsdnNumber, String origIsdnNumber);

	public String performMoForwardSMPartial(String msg, String destIsdnNumber, String origIsdnNumber, int msgRef, int segmCnt, int segmNum);

	public String performAlertServiceCentre(String destIsdnNumber);

	public String closeCurrentDialog();

}

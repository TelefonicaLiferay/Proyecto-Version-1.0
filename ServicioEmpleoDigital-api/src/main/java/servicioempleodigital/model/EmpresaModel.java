/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package servicioempleodigital.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Empresa service. Represents a row in the &quot;FOO_Empresa&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link servicioempleodigital.model.impl.EmpresaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link servicioempleodigital.model.impl.EmpresaImpl}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Empresa
 * @see servicioempleodigital.model.impl.EmpresaImpl
 * @see servicioempleodigital.model.impl.EmpresaModelImpl
 * @generated
 */
@ProviderType
public interface EmpresaModel extends BaseModel<Empresa> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a empresa model instance should use the {@link Empresa} interface instead.
	 */

	/**
	 * Returns the primary key of this empresa.
	 *
	 * @return the primary key of this empresa
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this empresa.
	 *
	 * @param primaryKey the primary key of this empresa
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the id empresa of this empresa.
	 *
	 * @return the id empresa of this empresa
	 */
	public long getIdEmpresa();

	/**
	 * Sets the id empresa of this empresa.
	 *
	 * @param idEmpresa the id empresa of this empresa
	 */
	public void setIdEmpresa(long idEmpresa);

	/**
	 * Returns the cif of this empresa.
	 *
	 * @return the cif of this empresa
	 */
	@AutoEscape
	public String getCif();

	/**
	 * Sets the cif of this empresa.
	 *
	 * @param cif the cif of this empresa
	 */
	public void setCif(String cif);

	/**
	 * Returns the razon social of this empresa.
	 *
	 * @return the razon social of this empresa
	 */
	@AutoEscape
	public String getRazonSocial();

	/**
	 * Sets the razon social of this empresa.
	 *
	 * @param razonSocial the razon social of this empresa
	 */
	public void setRazonSocial(String razonSocial);

	/**
	 * Returns the telefono of this empresa.
	 *
	 * @return the telefono of this empresa
	 */
	@AutoEscape
	public String getTelefono();

	/**
	 * Sets the telefono of this empresa.
	 *
	 * @param telefono the telefono of this empresa
	 */
	public void setTelefono(String telefono);

	/**
	 * Returns the email of this empresa.
	 *
	 * @return the email of this empresa
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this empresa.
	 *
	 * @param email the email of this empresa
	 */
	public void setEmail(String email);

	/**
	 * Returns the web of this empresa.
	 *
	 * @return the web of this empresa
	 */
	@AutoEscape
	public String getWeb();

	/**
	 * Sets the web of this empresa.
	 *
	 * @param web the web of this empresa
	 */
	public void setWeb(String web);

	/**
	 * Returns the password of this empresa.
	 *
	 * @return the password of this empresa
	 */
	@AutoEscape
	public String getPassword();

	/**
	 * Sets the password of this empresa.
	 *
	 * @param password the password of this empresa
	 */
	public void setPassword(String password);

	/**
	 * Returns the provincia of this empresa.
	 *
	 * @return the provincia of this empresa
	 */
	public int getProvincia();

	/**
	 * Sets the provincia of this empresa.
	 *
	 * @param provincia the provincia of this empresa
	 */
	public void setProvincia(int provincia);

	/**
	 * Returns the ciudad of this empresa.
	 *
	 * @return the ciudad of this empresa
	 */
	@AutoEscape
	public String getCiudad();

	/**
	 * Sets the ciudad of this empresa.
	 *
	 * @param ciudad the ciudad of this empresa
	 */
	public void setCiudad(String ciudad);

	/**
	 * Returns the trabajadores of this empresa.
	 *
	 * @return the trabajadores of this empresa
	 */
	public int getTrabajadores();

	/**
	 * Sets the trabajadores of this empresa.
	 *
	 * @param trabajadores the trabajadores of this empresa
	 */
	public void setTrabajadores(int trabajadores);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(servicioempleodigital.model.Empresa empresa);

	@Override
	public int hashCode();

	@Override
	public CacheModel<servicioempleodigital.model.Empresa> toCacheModel();

	@Override
	public servicioempleodigital.model.Empresa toEscapedModel();

	@Override
	public servicioempleodigital.model.Empresa toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
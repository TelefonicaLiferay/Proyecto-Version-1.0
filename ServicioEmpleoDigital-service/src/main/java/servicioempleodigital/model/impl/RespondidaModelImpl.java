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

package servicioempleodigital.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import servicioempleodigital.model.Respondida;
import servicioempleodigital.model.RespondidaModel;
import servicioempleodigital.model.RespondidaSoap;

import servicioempleodigital.service.persistence.RespondidaPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Respondida service. Represents a row in the &quot;FOO_Respondida&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link RespondidaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RespondidaImpl}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see RespondidaImpl
 * @see Respondida
 * @see RespondidaModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class RespondidaModelImpl extends BaseModelImpl<Respondida>
	implements RespondidaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a respondida model instance should use the {@link Respondida} interface instead.
	 */
	public static final String TABLE_NAME = "FOO_Respondida";
	public static final Object[][] TABLE_COLUMNS = {
			{ "idRespuesta", Types.BIGINT },
			{ "idCandidato", Types.BIGINT },
			{ "respuesta", Types.VARCHAR },
			{ "respondida", Types.BOOLEAN }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("idRespuesta", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("idCandidato", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("respuesta", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("respondida", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE = "create table FOO_Respondida (idRespuesta LONG not null,idCandidato LONG not null,respuesta VARCHAR(75) null,respondida BOOLEAN,primary key (idRespuesta, idCandidato))";
	public static final String TABLE_SQL_DROP = "drop table FOO_Respondida";
	public static final String ORDER_BY_JPQL = " ORDER BY respondida.id.idRespuesta ASC, respondida.id.idCandidato ASC";
	public static final String ORDER_BY_SQL = " ORDER BY FOO_Respondida.idRespuesta ASC, FOO_Respondida.idCandidato ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(servicioempleodigital.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.servicioempleodigital.model.Respondida"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(servicioempleodigital.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.servicioempleodigital.model.Respondida"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Respondida toModel(RespondidaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Respondida model = new RespondidaImpl();

		model.setIdRespuesta(soapModel.getIdRespuesta());
		model.setIdCandidato(soapModel.getIdCandidato());
		model.setRespuesta(soapModel.getRespuesta());
		model.setRespondida(soapModel.getRespondida());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Respondida> toModels(RespondidaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Respondida> models = new ArrayList<Respondida>(soapModels.length);

		for (RespondidaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(servicioempleodigital.service.util.ServiceProps.get(
				"lock.expiration.time.servicioempleodigital.model.Respondida"));

	public RespondidaModelImpl() {
	}

	@Override
	public RespondidaPK getPrimaryKey() {
		return new RespondidaPK(_idRespuesta, _idCandidato);
	}

	@Override
	public void setPrimaryKey(RespondidaPK primaryKey) {
		setIdRespuesta(primaryKey.idRespuesta);
		setIdCandidato(primaryKey.idCandidato);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new RespondidaPK(_idRespuesta, _idCandidato);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((RespondidaPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return Respondida.class;
	}

	@Override
	public String getModelClassName() {
		return Respondida.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idRespuesta", getIdRespuesta());
		attributes.put("idCandidato", getIdCandidato());
		attributes.put("respuesta", getRespuesta());
		attributes.put("respondida", getRespondida());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idRespuesta = (Long)attributes.get("idRespuesta");

		if (idRespuesta != null) {
			setIdRespuesta(idRespuesta);
		}

		Long idCandidato = (Long)attributes.get("idCandidato");

		if (idCandidato != null) {
			setIdCandidato(idCandidato);
		}

		String respuesta = (String)attributes.get("respuesta");

		if (respuesta != null) {
			setRespuesta(respuesta);
		}

		Boolean respondida = (Boolean)attributes.get("respondida");

		if (respondida != null) {
			setRespondida(respondida);
		}
	}

	@JSON
	@Override
	public long getIdRespuesta() {
		return _idRespuesta;
	}

	@Override
	public void setIdRespuesta(long idRespuesta) {
		_idRespuesta = idRespuesta;
	}

	@JSON
	@Override
	public long getIdCandidato() {
		return _idCandidato;
	}

	@Override
	public void setIdCandidato(long idCandidato) {
		_idCandidato = idCandidato;
	}

	@JSON
	@Override
	public String getRespuesta() {
		if (_respuesta == null) {
			return StringPool.BLANK;
		}
		else {
			return _respuesta;
		}
	}

	@Override
	public void setRespuesta(String respuesta) {
		_respuesta = respuesta;
	}

	@JSON
	@Override
	public boolean getRespondida() {
		return _respondida;
	}

	@JSON
	@Override
	public boolean isRespondida() {
		return _respondida;
	}

	@Override
	public void setRespondida(boolean respondida) {
		_respondida = respondida;
	}

	@Override
	public Respondida toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Respondida)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RespondidaImpl respondidaImpl = new RespondidaImpl();

		respondidaImpl.setIdRespuesta(getIdRespuesta());
		respondidaImpl.setIdCandidato(getIdCandidato());
		respondidaImpl.setRespuesta(getRespuesta());
		respondidaImpl.setRespondida(getRespondida());

		respondidaImpl.resetOriginalValues();

		return respondidaImpl;
	}

	@Override
	public int compareTo(Respondida respondida) {
		RespondidaPK primaryKey = respondida.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Respondida)) {
			return false;
		}

		Respondida respondida = (Respondida)obj;

		RespondidaPK primaryKey = respondida.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Respondida> toCacheModel() {
		RespondidaCacheModel respondidaCacheModel = new RespondidaCacheModel();

		respondidaCacheModel.respondidaPK = getPrimaryKey();

		respondidaCacheModel.idRespuesta = getIdRespuesta();

		respondidaCacheModel.idCandidato = getIdCandidato();

		respondidaCacheModel.respuesta = getRespuesta();

		String respuesta = respondidaCacheModel.respuesta;

		if ((respuesta != null) && (respuesta.length() == 0)) {
			respondidaCacheModel.respuesta = null;
		}

		respondidaCacheModel.respondida = getRespondida();

		return respondidaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{idRespuesta=");
		sb.append(getIdRespuesta());
		sb.append(", idCandidato=");
		sb.append(getIdCandidato());
		sb.append(", respuesta=");
		sb.append(getRespuesta());
		sb.append(", respondida=");
		sb.append(getRespondida());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("servicioempleodigital.model.Respondida");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idRespuesta</column-name><column-value><![CDATA[");
		sb.append(getIdRespuesta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idCandidato</column-name><column-value><![CDATA[");
		sb.append(getIdCandidato());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>respuesta</column-name><column-value><![CDATA[");
		sb.append(getRespuesta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>respondida</column-name><column-value><![CDATA[");
		sb.append(getRespondida());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Respondida.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Respondida.class
		};
	private long _idRespuesta;
	private long _idCandidato;
	private String _respuesta;
	private boolean _respondida;
	private Respondida _escapedModel;
}
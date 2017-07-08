package ru.md.sequence.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSBMPSequenceHomeBean_d839a054
 */
public class EJSBMPSequenceHomeBean_d839a054 extends EJSHome {
	/**
	 * EJSBMPSequenceHomeBean_d839a054
	 */
	public EJSBMPSequenceHomeBean_d839a054() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public ru.md.sequence.ejb.SequenceLocal findByPrimaryKey_Local(ru.md.sequence.ejb.SequenceKey key) throws javax.ejb.FinderException, java.rmi.RemoteException {
		ru.md.sequence.ejb.SequenceLocal _EJS_bmp = (ru.md.sequence.ejb.SequenceLocal)super.getBean_Local(key);
		if (_EJS_bmp==null) {
			EntityBeanO _EJS_beanO = null;
			ru.md.sequence.ejb.SequenceKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				ru.md.sequence.ejb.SequenceBean _EJS_bean = (ru.md.sequence.ejb.SequenceBean)_EJS_beanO.getEnterpriseBean();
				_EJS_key = (ru.md.sequence.ejb.SequenceKey)_EJS_bean.ejbFindByPrimaryKey(key);
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
			}
			catch (javax.ejb.FinderException finderEx) {
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
				throw finderEx;
			}
			finally {
				if (_EJS_beanO != null)
					super.discardFinderEntityBeanO(_EJS_beanO);
			}
			_EJS_bmp = (ru.md.sequence.ejb.SequenceLocal)super.activateBean_Local((java.lang.Object)_EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 */
	public ru.md.sequence.ejb.SequenceLocal create_Local(java.lang.String id, long value) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		ru.md.sequence.ejb.SequenceLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			ru.md.sequence.ejb.SequenceBean bean = (ru.md.sequence.ejb.SequenceBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			ru.md.sequence.ejb.SequenceKey _primaryKey = bean.ejbCreate(id, value);
			result = (ru.md.sequence.ejb.SequenceLocal) super.postCreate_Local(beanO, _primaryKey, true);
			bean.ejbPostCreate(id, value);
			super.afterPostCreate(beanO, _primaryKey);
		}
		catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if(preCreateFlag && !createFailed)
				super.afterPostCreateCompletion(beanO);
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
}

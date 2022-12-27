package com.solera.global.qa.bootcamp.web.behavior.data;

import com.solera.global.qa.core.framework.data.EnvironmentPropertiesBase;
import com.solera.global.qa.core.framework.main.EnvironmentPropertyRegister;
import java.util.List;


public final class BootcampWebPropertiesReader extends EnvironmentPropertiesBase {

    public BootcampWebPropertiesReader(String propertiesFileName, List<EnvironmentPropertyRegister> cliArgs) {
        super(propertiesFileName, cliArgs);
    }

}

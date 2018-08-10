package com.kahla.chuckNorris_maven_plugin;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 *
 * @goal touch
 * 
 * @phase process-sources
 */
@Mojo(name = "chuck-norris-wisdom")
public class ChuckNorrisMojo extends AbstractMojo {

    @Parameter(property = "nrOfWisdoms", defaultValue = "1")
    private String nrOfWisdoms;

    public void execute() throws MojoExecutionException {

        getLog().info("Executing chuck-norris-wisdom plugin");
        getLog().info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        getLog().info("Delighting with " + nrOfWisdoms + " wisdoms ...");

        try {
            RestClient restClient = new RestClient();
            for (int i = 0; i < Integer.parseInt(nrOfWisdoms); i++) {
                Wisdom wisdom = restClient.getWisdom();
                getLog().info("   " + wisdom.getValue());
            }
            getLog().info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (Exception e) {
            getLog().error(e);
        }

    }

    public String getNrOfWisdoms() {
        return nrOfWisdoms;
    }

    public void setNrOfWisdoms(String nrOfWisdoms) {
        this.nrOfWisdoms = nrOfWisdoms;
    }

}

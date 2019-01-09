/*

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.github.oscerd.helloworld;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.github.oscerd.helloworld.handlers.CancelandStopIntentHandler;
import com.github.oscerd.helloworld.handlers.FallbackIntentHandler;
import com.github.oscerd.helloworld.handlers.HelloWorldIntentHandler;
import com.github.oscerd.helloworld.handlers.HelpIntentHandler;
import com.github.oscerd.helloworld.handlers.LaunchRequestHandler;
import com.github.oscerd.helloworld.handlers.SessionEndedRequestHandler;
import com.amazon.ask.SkillStreamHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                // Add your skill id below
                //.withSkillId("")
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}

/**
 * Copyright (c) 2009, Nels E. Beckman
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met:
 * 
 * -Redistributions of source code must retain the above copyright notice, 
 *  this list of conditions and the following disclaimer.
 * -Redistributions in binary form must reproduce the above copyright notice, 
 *  this list of conditions and the following disclaimer in the documentation 
 *  and/or other materials provided with the distribution.
 * -Neither the name of Nels E. Beckman nor the names of any contributors 
 *  may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *  
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 */
package nbeckman.latemaster;

import nbeckman.latemaster.screens.RoutesListScreen;
import net.rim.device.api.ui.UiApplication;

/**
 * The main class of the application. On start creates
 * a RoutesListScreen and displays it.
 * 
 * @author Nels E. Beckman
 *
 */
public class Latemaster extends UiApplication implements Runnable {

	public static void main(String[] args) {
		(new Latemaster()).run();
	}

	public void run() {
		RoutesListScreen main_screen = new RoutesListScreen();
		main_screen.initialize();
		this.pushScreen(main_screen);
		this.enterEventDispatcher();
	}	
}

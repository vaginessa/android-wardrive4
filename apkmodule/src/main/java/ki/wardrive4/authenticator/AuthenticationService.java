/*
 *   wardrive4 - android wardriving application (remake for the ICS)
 *   Copyright (C) 2012 Raffaele Ragni
 *   https://github.com/raffaeleragni/android-wardrive4
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *   
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ki.wardrive4.authenticator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Background service (singleton holder) that will return a binding to the
 * authenticator.
 * 
 * @author Raffaele Ragni <raffaele.ragni@gmail.com>
 */
public class AuthenticationService extends Service
{
    private Authenticator mAuthenticator;

    @Override
    public void onCreate()
    {
        mAuthenticator = new Authenticator(this);
    }
    
    @Override
    public IBinder onBind(Intent intent)
    {
        return mAuthenticator.getIBinder();
    }
}

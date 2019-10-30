/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain.layers;

/**
 *
 * @author Alexander Atanasov
 */
public interface FeedforwardNetworkLayer extends NetworkLayer{
    @Override
    default void nextActiveCycle(){
        //
    }
    
    @Override
    default void nextPassiveCycle(){
        //
    }
}
